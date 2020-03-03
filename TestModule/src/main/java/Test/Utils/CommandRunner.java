package Test.Utils;

import Logic.ImprovedParserManager;
import Test.Exceptions.TestDropDatabaseError;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommandRunner {
    private static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    private static final String CLEAR_COMMAND = "[@Clear]";

    private enum PRINT_LEVEL {
        RESULT,
        ERROR,
        ALL,
    };

    private ImprovedParserManager parserManager;

    private PRINT_LEVEL printLevel;

    public CommandRunner() {
        printLevel = PRINT_LEVEL.ERROR;

        parserManager = new ImprovedParserManager();
    }

    public String runCommand(String cmd) {
        if (cmd.equals("[@Clear]")) {
            dropDatabase();
        } else if (cmd.startsWith(PRINT_LEVEL_COMMAND)) {
            configPrintLevel(cmd);
        }

        return parserManager.Parse(cmd);
    }

    private void dropDatabase() {
        try {
            FileUtils.deleteDirectory(new File(System.getProperty("user.home") + "/.dbms"));
        } catch (IOException e) {
            Printer.printCriticalError(e);
            Printer.printCriticalError(new TestDropDatabaseError("error dropping database"));
        }

        parserManager = new ImprovedParserManager();
        Printer.printInfo("Database dropped");
    }

    private void configPrintLevel(String cmd) {
        String print_level = cmd.replace(PRINT_LEVEL_COMMAND, "").trim();
        boolean flag = false;
        for (PRINT_LEVEL level: PRINT_LEVEL.values()) {
            if (level.name().equals(print_level)) {
                Printer.printInfo("PrintLevel set to " + print_level);
                printLevel = level;
                flag = true;
            }
        }
        if (!flag) {
            Printer.printError("Can not set print level to " + print_level);
        }
    }
}
