package Test.Engine;

import Test.Utils.ClientHelper;
import Test.Utils.Printer;
import Test.Utils.ServerHelper;
import Test.Utils.Statuses.Status;
import Test.Utils.Statuses.StatusCounter;
import Test.Utils.Statuses.StatusParser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestRunner extends Thread {
    private final ClientHelper clientHelper;
    private final TesterCommander commands;
    private Test test;

    public TestRunner(Test test) {
        this.test = test;
        clientHelper = new ClientHelper();
        commands = new TesterCommander(clientHelper);
    }

    @Override
    public void run() {
        StatusCounter statusCounter = new StatusCounter();

        FileOutputStream statusStream;
        FileOutputStream resultStream;

        try {
            statusStream = new FileOutputStream(test.getStatusFile());
            resultStream = new FileOutputStream(test.getResultFile());
        } catch (FileNotFoundException e) {
            Printer.printError(e);
            return;
        }

        for (String query : test.getQueries()) {
            if (commands.isFrameworkCommand(query)) {
                commands.parseFrameworkCommand(query);
                continue;
            }

            while (!ServerHelper.getServerStatus()) {
                Printer.printTestInfo("Waiting client-server up...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            String answer = clientHelper.communicate(query).trim();
            Status status = StatusParser.parse(query, answer);
            statusCounter.parse(status);

            if (commands.getPrintLevel() == TesterCommander.PRINT_LEVEL.EXTENDED) {
                Printer.printTest(query, answer);
            }

            if (!commands.isNoOutput()) {
                try {
                    statusStream.write(status.toString().concat("\n").getBytes());
                    resultStream.write((answer + "\n").getBytes());
                } catch (IOException e) {
                    Printer.printError(e);
                }
            }
        }

        if (commands.getPrintLevel() == TesterCommander.PRINT_LEVEL.EXTENDED) {
            Printer.printInBox(statusCounter.toString());
        }
    }
}
