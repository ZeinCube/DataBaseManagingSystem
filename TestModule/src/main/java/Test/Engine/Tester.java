package Test.Engine;

import Test.Exceptions.DropDatabaseException;
import Test.Exceptions.TestWrongResultException;
import Test.Utils.CSWorker;
import Test.Utils.Configurator;
import Test.Utils.Printer;
import Test.Utils.Statuses.Status;
import Test.Utils.Statuses.StatusCounter;
import Test.Utils.Statuses.StatusParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * class Tester
 * Core of testing framework
 */
public class Tester {

    private static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    private static final String CLEAR_COMMAND = "[@Clear]";

    private enum PRINT_LEVEL {MAIN, EXTENDED}

    private Configurator configurator;
    private PRINT_LEVEL printLevel;

    public Tester() {
        printLevel = PRINT_LEVEL.MAIN;

        configurator = new Configurator();
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
            File expected = new File(test_folder + "expected/" + test + ".expected");
            File output = new File(test_folder + "results/" + test + ".out");
            File codes = new File(test_folder + "results/" + test + ".codes");

            try {
                runTest(input, output, codes);
                checkTest(output, expected);
            } catch (Exception e) {
                Printer.printError(e);
            }

            Printer.printDelimiter();
        }
    }

    private void runTest(File input, File output, File codes) throws IOException {
        Printer.printTask("Test run task");

        Scanner inputScanner = new Scanner(input);
        FileOutputStream outputStream = new FileOutputStream(output);
        FileOutputStream codesStream = new FileOutputStream(codes);

        StatusCounter statusCounter = new StatusCounter();

        while (inputScanner.hasNextLine()) {
            String query = inputScanner.nextLine();

            if (query.startsWith(PRINT_LEVEL_COMMAND)) {
                configPrintLevel(query);
            } else if (query.startsWith(CLEAR_COMMAND)) {
                dropDatabase();
            } else {
                String answer = CSWorker.communicate(query).trim();

                Status status = StatusParser.parse(query, answer);
                codesStream.write(status.toString().concat("\n").getBytes());
                statusCounter.parse(status);

                if (printLevel == PRINT_LEVEL.EXTENDED) {
                    Printer.printTest(query, answer);
                }

                outputStream.write((answer + "\n").getBytes());
            }
        }

        if (printLevel == PRINT_LEVEL.EXTENDED) {
            Printer.printInBox(statusCounter.toString());
        }
    }


    private void checkTest(File results, File expected) throws FileNotFoundException {
        Printer.printTask("Test check task");

        Scanner resultsScanner = new Scanner(results);
        Scanner expectedScanner = new Scanner(expected);

        int counter = 0;

        while (expectedScanner.hasNextLine() || resultsScanner.hasNextLine()) {
            counter += 1;

            String resultStr = null, expectedStr = null;
            if (resultsScanner.hasNextLine())
                resultStr = resultsScanner.nextLine();
            if (expectedScanner.hasNextLine())
                expectedStr = expectedScanner.nextLine();

            if (resultStr == null || expectedStr == null || !expectedStr.equals(resultStr)) {
                Printer.printTestError(new TestWrongResultException("Wrong test result on line " + counter), expectedStr, resultStr);
            }
        }

        resultsScanner.close();
        expectedScanner.close();
    }

    private void dropDatabase() {
        try {
            FileUtils.deleteDirectory(new File(System.getProperty("user.home") + "/.dbms"));
        } catch (IOException e) {
            Printer.printCriticalError(e);
            Printer.printCriticalError(new DropDatabaseException());
        }

        if (printLevel == PRINT_LEVEL.EXTENDED) {
            Printer.printTestInfo("Database dropped");
        }
    }

    private void configPrintLevel(String cmd) {
        String print_level = cmd.replace(PRINT_LEVEL_COMMAND, "").trim();
        boolean flag = false;
        for (PRINT_LEVEL level : PRINT_LEVEL.values()) {
            if (level.name().equals(print_level)) {
                printLevel = level;
                flag = true;

                if (printLevel == PRINT_LEVEL.EXTENDED) {
                    Printer.printTestInfo("PrintLevel set to " + print_level);
                }
            }
        }

        if (!flag) {
            Printer.printTestError("Can not set print level to " + printLevel);
        }
    }
}
