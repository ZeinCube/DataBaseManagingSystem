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

public class TesterRunner extends Thread {
    private final ClientHelper clientHelper;
    private final TesterCommander commands;
    private final Test test;
    private StatusCounter statusCounter;

    public TesterRunner(Test test) {
        this.test = test;
        clientHelper = new ClientHelper();
        clientHelper.runClient();
        commands = new TesterCommander(clientHelper);
        statusCounter = new StatusCounter();
    }

    public String getTestName() {
        return test.getName();
    }

    @Override
    public void run() {
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
                Printer.printTestQuery(query, answer);
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
    }

    public StatusCounter getStatusCounter() {
        return statusCounter;
    }
}
