package Test.Engine;

import Test.Exceptions.DropDatabaseException;
import Test.Utils.ClientHelper;
import Test.Utils.Printer;
import Test.Utils.ServerHelper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class TesterCommander {

    private final ClientHelper clientHelper;

    public TesterCommander(ClientHelper clientHelper) {
        this.clientHelper = clientHelper;
        printLevel = PRINT_LEVEL.MAIN;
        noOutput = false;
    }

    public static final String FRAMEWORK_COMMAND_PREFIX = "[@";

    public static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    public static final String CLEAR_COMMAND = "[@Clear]";
    public static final String SLEEP_COMMAND = "[@Sleep]";
    public static final String RESTART_SERVER_COMMAND = "[@RestartServer]";
    public static final String NO_OUTPUT_COMMAND = "[@NoOutput]";
    public static final String ECHO_COMMAND = "[@Echo]";

    public enum PRINT_LEVEL {NONE, MAIN, EXTENDED}

    private PRINT_LEVEL printLevel;

    private boolean noOutput;

    public boolean isFrameworkCommand(String cmd) {
        return cmd.startsWith(FRAMEWORK_COMMAND_PREFIX);
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
        } else if (cmd.startsWith(NO_OUTPUT_COMMAND)) {
            noOutputToggle();
        } else if (cmd.startsWith(ECHO_COMMAND)) {
            echoCommand(cmd);
        }
    }

    // #########################
    // [@PrintLevel] command
    // #########################

    public PRINT_LEVEL getPrintLevel() {
        return printLevel;
    }

    public void resetPrintLevel() {
        this.printLevel = PRINT_LEVEL.MAIN;
    }

    public void setPrintLevel(PRINT_LEVEL printLevel) {
        this.printLevel = printLevel;
    }

    private void configPrintLevel(String cmd) {
        String printLevel = cmd.replace(TesterCommander.PRINT_LEVEL_COMMAND, "").trim();
        boolean flag = false;
        for (TesterCommander.PRINT_LEVEL level : TesterCommander.PRINT_LEVEL.values()) {
            if (level.name().equals(printLevel)) {
                setPrintLevel(level);
                flag = true;

                if (getPrintLevel() == TesterCommander.PRINT_LEVEL.NONE) {
                    Printer.offSystemOut();
                } else {
                    Printer.resetSystemOut();
                }

                if (getPrintLevel() == TesterCommander.PRINT_LEVEL.EXTENDED) {
                    Printer.printTestInfo("PrintLevel set to " + printLevel);
                }
            }
        }

        if (!flag) {
            Printer.printTestError("Can not set print level to " + printLevel);
        }
    }

    // #########################
    // [@Echo] command
    // #########################

    private void echoCommand(String cmd) {
        String line = cmd.replace(ECHO_COMMAND, "").trim();
        Printer.printTestInfo(line);
    }

    // #########################
    // [@NoOutput] command
    // #########################

    private void noOutputToggle() {
        noOutput = !noOutput;
    }

    public boolean isNoOutput() {
        return noOutput;
    }

    // #########################
    // [@Clear] command
    // #########################

    private void clearCommand() {
        try {
            Files.walk(Paths.get(System.getProperty("user.home"), ".dbms"))
                    .sorted(Comparator.reverseOrder())
                    .map(Path::toFile)
                    .forEach(File::delete);
            Files.createDirectory(Paths.get(System.getProperty("user.home"), ".dbms"));
        } catch (IOException e) {
            Printer.printCriticalError(e);
            Printer.printCriticalError(new DropDatabaseException());
        }

        if (printLevel == TesterCommander.PRINT_LEVEL.EXTENDED) {
            Printer.printTestInfo("Database dropped");
        }
    }

    // #########################
    // [@Sleep] command
    // #########################

    private void sleepCommand(String cmd) {
        String time = cmd.replace(TesterCommander.SLEEP_COMMAND, "").trim();
        try {
            Thread.sleep(new Integer(time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // #########################
    // [@RestartServer]
    // #########################

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
            Printer.printInfo("Killing server");
        }

        try {
            ServerHelper.forceRestartServer();
            while (!ServerHelper.getServerStatus()) {
                Thread.sleep(10);
            }

            if (printLevel == PRINT_LEVEL.EXTENDED) {
                Printer.printInfo("Started server");
            }

            while (!clientHelper.getClientStatus()) {
                Thread.sleep(10);
            }

            if (printLevel == PRINT_LEVEL.EXTENDED) {
                Printer.printInfo("Client connected to server");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void restartServer(int time, int minTime) {
        int rand = (int) (Math.random() * ((time - minTime) + 1)) + minTime;

        try {
            Thread.sleep(rand);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        restartServer();
    }
}
