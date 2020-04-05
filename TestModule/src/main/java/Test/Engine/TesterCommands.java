package Test.Engine;

import Test.Exceptions.DropDatabaseException;
import Test.Utils.Printer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class TesterCommands {

    public TesterCommands() {
        systemOutCopy = System.out;
        printLevel = PRINT_LEVEL.MAIN;
        readNextLine = false;
    }

    public static final String COMMENT_COMMAND = "@@";
    public static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    public static final String CLEAR_COMMAND = "[@Clear]";
    public static final String SLEEP_COMMAND = "[@Sleep]";
    public static final String REPEAT_COMMAND = "[@Repeat]";

    public enum PRINT_LEVEL {NONE, MAIN, EXTENDED}

    private PrintStream systemOutCopy;
    private PRINT_LEVEL printLevel;

    public boolean readNextLine;

    public boolean isCommand(String cmd) {
        return cmd.startsWith("@@") || cmd.startsWith("[@") || cmd.isEmpty();
    }

    public void parseCommand(String cmd) {
        if (cmd.startsWith("@@") || cmd.isEmpty()) return;

        if (cmd.startsWith(TesterCommands.PRINT_LEVEL_COMMAND)) {
            configPrintLevel(cmd);
        } else if (cmd.startsWith(TesterCommands.CLEAR_COMMAND)) {
            clearCommand();
        } else if (cmd.startsWith(TesterCommands.SLEEP_COMMAND)) {
            sleepCommand(cmd);
        } else if (cmd.startsWith(TesterCommands.REPEAT_COMMAND)) {
            setRepeatMode(cmd);
        }
    }


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
            TimeUnit.MILLISECONDS.sleep(new Integer(time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    // [@Repeat] command
    private boolean REPEAT_MODE;
    private int repeatIterator;
    private int repeatMax;

    private void setRepeatMode(String cmd) {
        REPEAT_MODE = true;

        repeatIterator = 1;
        repeatMax = new Integer(cmd.replace(REPEAT_COMMAND, "").trim());

        readNextLine = true;
    }

    public boolean repeatModeEnabled() {
        return REPEAT_MODE;
    }

    public String repeatGetQuery(String cmd) {
        repeatIterator++;
        if (repeatIterator > repeatMax) {
            REPEAT_MODE = false;
        }

        return cmd.replaceAll("\\$i", String.valueOf(repeatIterator - 1));
    }

}
