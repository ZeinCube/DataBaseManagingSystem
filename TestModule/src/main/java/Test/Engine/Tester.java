package Test.Engine;

import Logic.ImprovedParserManager;
import Test.Exceptions.TestDropDatabaseError;
import Test.Exceptions.TestWrongResult;
import Test.Utils.CommandRunner;
import Test.Utils.Configurator;
import Test.Utils.Printer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Tester {
    private static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    private static final String CLEAR_COMMAND = "[@Clear]";

    private enum PRINT_LEVEL {RESULT, ERROR, ALL}

    ;
    private CommandRunner commandRunner;
    private Configurator configurator;
    private ImprovedParserManager parserManager;
    private PRINT_LEVEL printLevel;

    public Tester() {
        printLevel = PRINT_LEVEL.ALL;

        commandRunner = new CommandRunner();
        configurator = new Configurator();
        parserManager = new ImprovedParserManager();
    }

    public Configurator getConfigurator() {
        return configurator;
    }

    public void test(String testName) {
        String test_folder = configurator.getTestFolder(testName);
        String[] tests = new File(test_folder).list((file, s) -> s.endsWith(".in"));

        if (tests == null) return;

        for (String test : tests) {
            test = test.replace(".in", "");

            Printer.printDelimiter();
            Printer.printInfo("Running test <" + test + ">");

            File input = new File(test_folder + test + ".in");
            File expected = new File(test_folder + "expected\\" + test + ".expected");
            File output = new File(test_folder + "results\\" + test + ".out");

            // TODO: check status codes and save them in .codes file
            File codes = new File(test_folder + "results\\" + test + ".codes");

            try {
                runTest(input, output);
                checkTest(output, expected);
            } catch (Exception e) {
                Printer.printError(e);
            }


            Printer.printDelimiter();
        }
    }

    private void runTest(File input, File output) {

    }


    private void checkTest(File results, File expected) throws FileNotFoundException {
        Scanner resultsScanner = new Scanner(expected);
        Scanner expectedScanner = new Scanner(expected);

        while (resultsScanner.hasNextLine() && expectedScanner.hasNextLine()) {
            String resultStr = resultsScanner.nextLine();
            String expectedStr = expectedScanner.nextLine();
            if (!resultsScanner.nextLine().equals(expectedScanner.nextLine())) {
                String errorMessage = String.format("Wrong test result\nExpected:\n%s\nResult:\n%s", expectedStr, resultStr);
                Printer.printError(new TestWrongResult(errorMessage));
            }
        }
    }

    private void dropDatabase() {
        try {
            FileUtils.deleteDirectory(new File(System.getProperty("user.home") + "/.dbms"));
        } catch (IOException e) {
            Printer.printCriticalError(e);
            Printer.printCriticalError(new TestDropDatabaseError("error dropping database"));
        }

        parserManager = new ImprovedParserManager();
        if (printLevel == PRINT_LEVEL.ALL) {
            Printer.printInfo("Database dropped");
        }
    }

    private void configPrintLevel(String cmd) {
        String print_level = cmd.replace(PRINT_LEVEL_COMMAND, "").trim();
        boolean flag = false;
        for (PRINT_LEVEL level : PRINT_LEVEL.values()) {
            if (level.name().equals(print_level)) {
                if (printLevel == PRINT_LEVEL.ALL) {
                    Printer.printInfo("PrintLevel set to " + print_level);
                }
                printLevel = level;
                flag = true;
            }
        }

        if (!flag) {
            Printer.printError("Can not set print level to " + print_level);
        }
    }
}
