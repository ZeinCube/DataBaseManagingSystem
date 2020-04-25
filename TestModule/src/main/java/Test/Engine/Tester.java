package Test.Engine;

import Test.Exceptions.TestWrongResultException;
import Test.Utils.Configurator;
import Test.Utils.Printer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    private final Configurator configurator;
    private final TesterPreprocessor preprocessor;

    public Tester() {
        configurator = new Configurator();
        preprocessor = new TesterPreprocessor();
    }

    public Configurator getConfigurator() {
        return configurator;
    }

    private ArrayList<Test> prepareTests(String testName) throws IOException {
        ArrayList<Test> tests = new ArrayList<>();

        String testFolder = configurator.getTestFolder(testName);
        String[] testFiles = new File(testFolder).list((file, s) -> s.endsWith(".in"));

        if (testFiles == null) return tests;

        for (String test : testFiles) {
            test = test.replace(".in", "");

            File resultsFolder = new File(testFolder + "results/");
            resultsFolder.mkdirs();

            File input = new File(testFolder + test + ".in");
            File expected = new File(testFolder + "expected/" + test + ".expected");
            File result = new File(testFolder + "results/" + test + ".out");
            File statuses = new File(testFolder + "results/" + test + ".codes");

            result.createNewFile();
            statuses.createNewFile();

            ArrayList<String> queries = loadTest(input);
            tests.add(new Test(queries, result, statuses, expected));
        }

        return tests;
    }

    private boolean checkTest(Test test) {
        Printer.printTask("Check test " + test.getName());

        boolean result = true;

        Scanner resultsScanner;
        Scanner expectedScanner;

        try {
            resultsScanner = new Scanner(new FileInputStream(test.getResultFile()));
            expectedScanner = new Scanner(new FileInputStream(test.getExpectedFile()));
        } catch (FileNotFoundException e) {
            Printer.printError(e);
            return false;
        }

        int counter = 0;

        while (expectedScanner.hasNextLine() || resultsScanner.hasNextLine()) {
            counter += 1;

            String resultStr = null, expectedStr = null;
            if (resultsScanner.hasNextLine())
                resultStr = resultsScanner.nextLine();
            if (expectedScanner.hasNextLine())
                expectedStr = expectedScanner.nextLine();

            if (expectedStr == null || !expectedStr.equals(resultStr)) {
                Printer.printTestError(new TestWrongResultException("Wrong test result on line " + counter), expectedStr, resultStr);
                result = false;
            }
        }

        resultsScanner.close();
        expectedScanner.close();

        return result;
    }

    public boolean test(String testName, boolean parallel) {
        boolean result = true;

        ArrayList<Test> tests;
        ArrayList<TesterRunner> runners = new ArrayList<>();

        try {
            tests = prepareTests(testName);
        } catch (IOException e) {
            Printer.printError(e);
            return false;
        }

        for (Test test : tests) {
            runners.add(new TesterRunner(test));
        }

        if (parallel) {
            Printer.globalOffSystemOut();
        }

        try {
            for (TesterRunner runner : runners) {
                Printer.printTask("Running test <" + runner.getTestName() + ">");
                runner.start();

                if (!parallel) {
                    runner.join();
                }
            }

            for (TesterRunner runner : runners) {
                runner.join();
            }
        } catch (InterruptedException e) {
            Printer.printError(e);
        }

        if (parallel) {
            Printer.globalResetSystemOut();
        }

        Printer.printTask("Statuses statistic");
        for (TesterRunner runner : runners) {
            Printer.printTestStatistic(runner.getTestName(), runner.getStatusCounter().toString());
        }

        for (Test test : tests) {
            if (!checkTest(test)) {
                result = false;
            }
        }

        Printer.globalResetSystemOut();

        return result;
    }

    private ArrayList<String> loadTest(File input) throws FileNotFoundException {
        ArrayList<String> queries = new ArrayList<>();
        Scanner queriesScanner = new Scanner(input);

        while (queriesScanner.hasNextLine()) {
            String query = getNextCommand(queriesScanner);
            if (preprocessor.isPreprocessorCommand(query)) {
                queries.addAll(preprocessor.parsePreprocessorCommand(query, getNextCommand(queriesScanner)));
            } else {
                if (!query.isEmpty()) {
                    queries.add(query);
                }
            }
        }

        queriesScanner.close();

        return queries;
    }

    private String getNextCommand(Scanner queriesScanner) {
        String line = "";

        while (queriesScanner.hasNextLine() && (line.isEmpty() || line.startsWith("@@"))) {
            line = queriesScanner.nextLine().trim();
        }

        if (preprocessor.isFrameworkCommand(line) || preprocessor.isPreprocessorCommand(line)) return line;

        boolean isTransaction = false;
        if (line.startsWith("BEGIN TRANSACTION")) {
            isTransaction = true;
        }

        StringBuilder query = new StringBuilder();
        query.append(line).append(isTransaction ? "\n" : " ");

        while (!line.endsWith(isTransaction ? "COMMIT;" : ";") && queriesScanner.hasNextLine()) {
            line = queriesScanner.nextLine().trim();

            if (line.isEmpty() || line.startsWith("@@")) {
                continue;
            }

            if (preprocessor.isPreprocessorCommand(line)) {
                ArrayList<String> temp = preprocessor.parsePreprocessorCommand(line, getNextCommand(queriesScanner));
                StringBuilder s = new StringBuilder();
                for (String t : temp) {
                    s.append(t).append("\n");
                }

                line = s.toString().trim();
            }

            query.append(line).append(isTransaction ? "\n" : " ");
        }

        return query.toString().trim();
    }
}
