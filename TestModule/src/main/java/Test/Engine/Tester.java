package Test.Engine;

import Test.Exceptions.TestWrongResultException;
import Test.Utils.CSWorker;
import Test.Utils.Configurator;
import Test.Utils.Printer;
import Test.Utils.Statuses.Status;
import Test.Utils.Statuses.StatusCounter;
import Test.Utils.Statuses.StatusParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Tester {
    private Configurator configurator;
    private TesterCommands commands;

    public Tester() {
        configurator = new Configurator();
        commands = new TesterCommands();
        clearCounters();
    }

    public Configurator getConfigurator() {
        return configurator;
    }

    private int countTests;
    private int countPassed;

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
                ArrayList<String> queries = loadTest(input);
                runTest(queries, output, codes);
                if (checkTest(output, expected)) {
                    countPassed++;
                }
            } catch (FileNotFoundException e) {
                Printer.printError(e);
                return;
            } catch (Exception e) {
                Printer.printError(e);
            }

            commands.resetSystemOut();

            Printer.printDelimiter();
        }
    }

    private ArrayList<String> loadTest(File input) throws FileNotFoundException {
        ArrayList<String> queries = new ArrayList<>();

        Scanner queriesScanner = new Scanner(input);

        StringBuilder query = new StringBuilder();
        while (queriesScanner.hasNextLine()) {
            String line = queriesScanner.nextLine().trim();

            if (line.isEmpty() || line.startsWith("@@")) {
                continue;
            }

            if (commands.isPreprocessorCommand(line)) {
                queries.addAll(commands.parsePreprocessorCommand(line, queriesScanner.nextLine().trim()));
                continue;
            }

            query.append(line).append(" ");

            if (line.endsWith(";") || commands.isFrameworkCommand(line)) {
                queries.add(query.toString().trim());
                query = new StringBuilder();
            }
        }

        return queries;
    }

    private void runTest(ArrayList<String> queries, File output, File codes) throws IOException {
        countTests++;

        FileOutputStream outputStream = new FileOutputStream(output);
        FileOutputStream codesStream = new FileOutputStream(codes);
        StatusCounter statusCounter = new StatusCounter();

        for (String query: queries) {
            if (commands.isFrameworkCommand(query)) {
                commands.parseFrameworkCommand(query);
                continue;
            }

            if (commands.waitServerUp()) {
                while (!CSWorker.getClientServerStatus()) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            String answer = CSWorker.communicate(query).trim();
            Status status = StatusParser.parse(query, answer);
            codesStream.write(status.toString().concat("\n").getBytes());
            statusCounter.parse(status);

            if (commands.getPrintLevel() == TesterCommands.PRINT_LEVEL.EXTENDED) {
                Printer.printTest(query, answer);
            }

            outputStream.write((answer + "\n").getBytes());
        }

        if (commands.getPrintLevel() == TesterCommands.PRINT_LEVEL.EXTENDED) {
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

    public boolean allPassed() {
        return countTests == countPassed;
    }

    public void clearCounters() {
        countTests = 0;
        countPassed = 0;
    }

    public void printStatistic() {
        Printer.printTestsStatistic(countTests, countPassed, countTests - countPassed);
    }
}
