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

public class Tester {
    private final Configurator configurator;
    private final TesterCommands commands;

    public Tester() {
        configurator = new Configurator();
        commands = new TesterCommands();
    }

    public Configurator getConfigurator() {
        return configurator;
    }

    public boolean test(File input) {
        String tmpFolder = configurator.getTempFolder();
        String testName = input.getName();
        if (testName.contains(".")) {
            testName = testName.split("\\.")[0];
        }

        Printer.printTask("Running test <" + testName + ">");

        File output = new File(tmpFolder + testName + ".out");
        File codes = new File(tmpFolder + testName + ".codes");

        try {
            output.createNewFile();
            codes.createNewFile();

            ArrayList<String> queries = loadTest(input);
            runTest(queries, output, codes);
        } catch (IOException e) {
            Printer.printError(e);
            return false;
        }

        Printer.printInfo("Test finished");

        return true;
    }

    public boolean test(String testName) {
        String testFolder = configurator.getTestFolder(testName);

        if (testFolder.isEmpty()) return false;

        String[] tests = new File(testFolder).list((file, s) -> s.endsWith(".in"));

        boolean status = true;

        if (tests == null) return true;

        for (String test : tests) {
            test = test.replace(".in", "");

            Printer.printDelimiter();
            Printer.printInfo("Running test <" + test + ">");

            File input = new File(testFolder + test + ".in");
            File expected = new File(testFolder + "expected/" + test + ".expected");
            File output = new File(testFolder + "results/" + test + ".out");
            File codes = new File(testFolder + "results/" + test + ".codes");

            try {
                File resultsFolder = new File(testFolder + "results/");
                if (!resultsFolder.exists()) {
                    resultsFolder.mkdirs();
                }

                output.createNewFile();
                codes.createNewFile();
            } catch (IOException e) {
                Printer.printError(e);
            }

            try {
                ArrayList<String> queries = loadTest(input);
                runTest(queries, output, codes);
                if (!checkTest(output, expected)) {
                    status = false;
                }
            } catch (FileNotFoundException e) {
                Printer.printError(e);
                return false;
            } catch (Exception e) {
                Printer.printError(e);
            }

            commands.resetSystemOut();

            Printer.printDelimiter();
        }

        return status;
    }

    private ArrayList<String> loadTest(File input) throws FileNotFoundException {
        ArrayList<String> queries = new ArrayList<>();
        Scanner queriesScanner = new Scanner(input);

        while (queriesScanner.hasNextLine()) {
            String query = getNextCommand(queriesScanner);
            if (commands.isPreprocessorCommand(query)) {
                queries.addAll(commands.parsePreprocessorCommand(query, getNextCommand(queriesScanner)));
            } else {
                queries.add(query);
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

        if (commands.isFrameworkCommand(line) || commands.isPreprocessorCommand(line)) return line;

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

            if (commands.isPreprocessorCommand(line)) {
                ArrayList<String> temp = commands.parsePreprocessorCommand(line, getNextCommand(queriesScanner));
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

    private void runTest(ArrayList<String> queries, File output, File codes) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(output);
        FileOutputStream codesStream = new FileOutputStream(codes);
        StatusCounter statusCounter = new StatusCounter();

        for (String query : queries) {
            if (commands.isFrameworkCommand(query)) {
                commands.parseFrameworkCommand(query);
                continue;
            }

            if (commands.isWaitServer()) {
                while (!CSWorker.getClientServerStatus()) {
                    Printer.printTestInfo("Waiting client-server up...");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            String answer = CSWorker.communicate(query).trim();
            Status status = StatusParser.parse(query, answer);
            statusCounter.parse(status);

            if (commands.getPrintLevel() == TesterCommands.PRINT_LEVEL.EXTENDED) {
                Printer.printTest(query, answer);
            }

            if (!commands.isNoOutput()) {
                codesStream.write(status.toString().concat("\n").getBytes());
                outputStream.write((answer + "\n").getBytes());
            }
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

            if (expectedStr == null || !expectedStr.equals(resultStr)) {
                Printer.printTestError(new TestWrongResultException("Wrong test result on line " + counter), expectedStr, resultStr);
                passed = false;
            }
        }

        resultsScanner.close();
        expectedScanner.close();

        return passed;
    }
}
