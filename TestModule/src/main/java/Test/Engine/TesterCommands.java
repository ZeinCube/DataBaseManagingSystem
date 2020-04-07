package Test.Engine;

import Test.Exceptions.DropDatabaseException;
import Test.Utils.CSWorker;
import Test.Utils.Printer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class TesterCommands {

    public TesterCommands() {
        systemOutCopy = System.out;
        printLevel = PRINT_LEVEL.MAIN;
        waitServer = false;
        noOutput = false;
    }

    public static final String FRAMEWORK_COMMAND_PREFIX = "[@";
    public static final String PREPROCESSOR_COMMAND_PREFIX = "[#";

    public static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    public static final String CLEAR_COMMAND = "[@Clear]";
    public static final String SLEEP_COMMAND = "[@Sleep]";
    public static final String RESTART_SERVER_COMMAND = "[@RestartServer]";
    public static final String WAIT_SERVER_UP_COMMAND = "[@WaitServer]";
    public static final String NO_OUTPUT_COMMAND = "[@NoOutput]";

    public static final String REPEAT_COMMAND = "[#Repeat]";

    public enum PRINT_LEVEL {NONE, MAIN, EXTENDED}

    private PrintStream systemOutCopy;
    private PRINT_LEVEL printLevel;

    private boolean waitServer;
    private boolean noOutput;

    public boolean isFrameworkCommand(String cmd) {
        return cmd.startsWith(FRAMEWORK_COMMAND_PREFIX);
    }

    public boolean isPreprocessorCommand(String cmd) {
        return cmd.startsWith(PREPROCESSOR_COMMAND_PREFIX);
    }

    public ArrayList<String> parsePreprocessorCommand(String cmd, String query) {
        if (cmd.startsWith(REPEAT_COMMAND)) {
            return repeatQuery(cmd, query);
        }

        return new ArrayList<>();
    }

    public void parseFrameworkCommand(String cmd) {
        if (cmd.startsWith(PRINT_LEVEL_COMMAND)) {
            configPrintLevel(cmd);
        } else if (cmd.startsWith(CLEAR_COMMAND)) {
            clearCommand();
        } else if (cmd.startsWith(SLEEP_COMMAND)) {
            sleepCommand(cmd);
        } else if (cmd.startsWith(RESTART_SERVER_COMMAND)) {
            restartServer(cmd);
        } else if (cmd.startsWith(WAIT_SERVER_UP_COMMAND)) {
            toggleWaitServer();
        } else if (cmd.startsWith(NO_OUTPUT_COMMAND)) {
            noOutputToggle();
        }
    }


    // #########################
    // Preprocessor commands
    // #########################

    // [#Repeat] command

    public ArrayList<String> repeatQuery(String cmd, String query) {
        ArrayList<String> queries = new ArrayList<>();

        int n = Integer.parseInt(cmd.split(" ")[1]);

        for (int i = 1; i <= n; i++) {
            queries.add(query.replaceAll("\\$i", String.valueOf(i)));
        }

        return queries;
    }


    // #########################
    // Framework commands
    // #########################

    // [@PrintLevel] command

    public PRINT_LEVEL getPrintLevel() {
        return printLevel;
    }

    public void setPrintLevel(PRINT_LEVEL printLevel) {
        this.printLevel = printLevel;
    }

    private void offSystemOut() {
        try {
            System.setOut(new PrintStream(new OutputStream() {
                public void write(int b) {
                }
            }));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resetSystemOut() {
        System.setOut(systemOutCopy);
    }

    private void configPrintLevel(String cmd) {
        String printLevel = cmd.replace(TesterCommands.PRINT_LEVEL_COMMAND, "").trim();
        boolean flag = false;
        for (TesterCommands.PRINT_LEVEL level : TesterCommands.PRINT_LEVEL.values()) {
            if (level.name().equals(printLevel)) {
                setPrintLevel(level);
                flag = true;

                if (getPrintLevel() == TesterCommands.PRINT_LEVEL.NONE) {
                    offSystemOut();
                } else {
                    resetSystemOut();
                }

                if (getPrintLevel() == TesterCommands.PRINT_LEVEL.EXTENDED) {
                    Printer.printTestInfo("PrintLevel set to " + printLevel);
                }
            }
        }

        if (!flag) {
            Printer.printTestError("Can not set print level to " + printLevel);
        }
    }


    // [@NoOutput] command

    public void noOutputToggle() {
        noOutput = !noOutput;
    }

    public boolean isNoOutput() {
        return noOutput;
    }


    // [@Clear] command

    private void clearCommand() {
        try {
            FileUtils.deleteDirectory(new File(System.getProperty("user.home") + "/.dbms"));
        } catch (IOException e) {
            Printer.printCriticalError(e);
            Printer.printCriticalError(new DropDatabaseException());
        }

        if (printLevel == TesterCommands.PRINT_LEVEL.EXTENDED) {
            Printer.printTestInfo("Database dropped");
        }
    }


    // [@Sleep] command

    private void sleepCommand(String cmd) {
        String time = cmd.replace(TesterCommands.SLEEP_COMMAND, "").trim();
        try {
            Thread.sleep(new Integer(time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // [@RestartServer]

    private void restartServer(String cmd) {
        cmd = cmd.replace(RESTART_SERVER_COMMAND, "").trim();
        String[] args = cmd.split(" ");
        if (cmd.isEmpty()) {
            restartServer();
        } else {
            int time = Integer.parseInt(args[0]);
            int minTime = args.length == 2 ? Integer.parseInt(args[1]) : 0;
            new Thread(() -> restartServer(time, minTime)).start();
        }
    }

    private void restartServer() {
        if (printLevel == PRINT_LEVEL.EXTENDED) {
            Printer.printInfo("Killing server with id " + CSWorker.getServerIdentityId());
        }

        try {
            CSWorker.forceRestartServer();
            while (!CSWorker.getServerStatus()) {
                Thread.sleep(10);
            }

            if (printLevel == PRINT_LEVEL.EXTENDED) {
                Printer.printInfo("Started server with id " + CSWorker.getServerIdentityId());
            }

            CSWorker.restartClient();
            while (!CSWorker.getClientStatus()) {
                Thread.sleep(10);
            }

            if (printLevel == PRINT_LEVEL.EXTENDED) {
                Printer.printInfo("Client connected to server with id " + CSWorker.getServerIdentityId());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void restartServer(int time, int minTime) {
        int rand = (int) (Math.random() * ((time - minTime) + 1)) + minTime;

        try {
            Thread.sleep(rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        restartServer();
    }


    // [@WaitServer]

    private void toggleWaitServer() {
        waitServer = !waitServer;
    }

    public boolean isWaitServer() {
        return waitServer;
    }
}
