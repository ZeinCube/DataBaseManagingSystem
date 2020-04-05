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

import java.io.*;
import java.util.Scanner;

/**
 * class Tester
 * Core of testing framework
 */
public class Tester {
    private static final String COMMENT_COMMAND = "@@";
    private static final String PRINT_LEVEL_COMMAND = "[@PrintLevel]";
    private static final String CLEAR_COMMAND = "[@Clear]";

    private enum PRINT_LEVEL {MAIN, EXTENDED, NONE}

    private Configurator configurator;
    private PRINT_LEVEL printLevel;
    private PrintStream systemOutCopy;

    private int countTests;
    private int countPassed;

    public Tester() {
        printLevel = PRINT_LEVEL.MAIN;
        systemOutCopy = System.out;

        clearCounters();

        configurator = new Configurator();
    }

    public void clearCounters() {
        countTests = 0;
        countPassed = 0;
    }

    public Configurator getConfigurator() {
        return configurator;
    }


    // Testing functions

    public void test(String testName) {
        String testFolder = configurator.getTestFolder(testName);
        String[] tests = new File(testFolder).list((file, s) -> s.endsWith(".in"));

        if (tests == null) return;

        for (String test : tests) {
            test = test.replace(".in", "");

            Printer.printDelimiter();
            Printer.printInfo("Running test <" + test + ">");

            File input = new File(testFolder + test + ".in");
            File expected = new File(testFolder + "expected/" + test + ".expected");
            File output = new File(testFolder + "results/" + test + ".out");
            File codes = new File(testFolder + "results/" + test + ".codes");

            try {
                runTest(input, output, codes);
                if (checkTest(output, expected)) {
                    countPassed++;
                }
            } catch (Exception e) {
                Printer.printError(e);
            }

            System.setOut(systemOutCopy);

            Printer.printDelimiter();
        }
    }

    private void runTest(File input, File output, File codes) throws IOException {
        countTests++;

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
            } else if (!query.startsWith(COMMENT_COMMAND)) {
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

    private boolean checkTest(File results, File expected) throws FileNotFoundException {
        boolean passed = true;

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
                passed = false;
            }
        }

        resultsScanner.close();
        expectedScanner.close();

        return passed;
    }


    // Framework commands

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
        String printLevel = cmd.replace(PRINT_LEVEL_COMMAND, "").trim();
        boolean flag = false;
        for (PRINT_LEVEL level : PRINT_LEVEL.values()) {
            if (level.name().equals(printLevel)) {
                this.printLevel = level;
                flag = true;

                if (this.printLevel == PRINT_LEVEL.NONE) {
                    try {
                        System.setOut(new PrintStream(new OutputStream() {
                            public void write(int b) {
                            }
                        }));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.setOut(systemOutCopy);
                }

                if (this.printLevel == PRINT_LEVEL.EXTENDED) {
                    Printer.printTestInfo("PrintLevel set to " + printLevel);
                }
            }
        }

        if (!flag) {
            Printer.printTestError("Can not set print level to " + printLevel);
        }
    }


    // Other functions

    public boolean allPassed() {
        return countTests == countPassed;
    }

    public void printStatistic() {
        Printer.printTestsStatistic(countTests, countPassed, countTests - countPassed);
    }
}
