package Test.Engine;

import Test.Utils.Printer;;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class TestCliEngine {

    private Tester tester;

    public TestCliEngine() {
        Printer.printDelimiter();
        Printer.printTask("Initializing Tester instance");

        tester = new Tester();

        Printer.printInfo("Tests folder: " + tester.getConfigurator().getTESTS_FOLDER());
        Printer.printDelimiter();
    }

    public boolean createTest(String[] testNames) {
        boolean status = true;

        for (String name : testNames) {
            Printer.printTask("Creating test <" + name + ">");

            String test_dir = tester.getConfigurator().getTESTS_FOLDER().concat(name);
            String test_results_dir = test_dir.concat("/results");
            String test_expected_dir = test_dir.concat("/expected");

            new File(test_dir).mkdirs();
            new File(test_results_dir).mkdirs();
            new File(test_expected_dir).mkdirs();

            try {
                new File(test_dir.concat("/test.in")).createNewFile();
                new File(test_expected_dir.concat("/test.expected")).createNewFile();
                Printer.printInfo("Test <" + name + "> created");
            } catch (IOException e) {
                Printer.printCriticalError(e);
                Printer.printError("Test <" + name + "> is not created");
                status = false;
            }
        }

        return false;
    }

    public void listTests() {
        for (String f : Objects.requireNonNull(new File(tester.getConfigurator().getTESTS_FOLDER()).list())) {
            Printer.printListElement(f);
        }
    }

    public boolean removeTests(String[] testNames) {
        boolean status = true;

        for (String name : testNames) {
            Printer.printTask("Deleting test <" + name + ">");
            File testFolder = new File(tester.getConfigurator().getTESTS_FOLDER() + name);
            if (testFolder.exists()) {
                try {
                    Files.walk(Paths.get(String.valueOf(testFolder)))
                            .map(Path::toFile)
                            .sorted((o1, o2) -> -o1.compareTo(o2))
                            .forEach(File::delete);
                    Printer.printInfo("Test <" + name + "> deleted");
                } catch (IOException e) {
                    Printer.printCriticalError(e);
                    status = false;
                }
            } else {
                Printer.printError("Test not found <" + name + ">");
                status = false;
            }
        }

        return status;
    }

    public boolean runTests(String[] testNames) {
        int countTests = 0;
        int countPassed = 0;

        boolean status = true;

        for (String testName : testNames) {
            Printer.printTask("Running test <" + testName + ">");
            countTests++;

            boolean result = tester.test(testName);

            if (result) {
                countPassed++;
            } else {
                status = false;
            }
        }

        Printer.printTestsStatistic(countTests, countPassed, countTests - countPassed);
        return status;
    }

    public boolean runFile(String[] args) {
        File input = new File(args[0]);
        if (!input.exists()) return false;
        return tester.test(input);
    }

    public boolean runAllTests() {
        Printer.printTask("Running all tests");
        Printer.printDelimiter();

        List<String> folders = Arrays.asList(new File(tester.getConfigurator().getTESTS_FOLDER()).list());

        if (folders.contains("rqg")) folders.remove("rqg");
        if (folders.contains("temp")) folders.remove("temp");

        return runTests((String[]) folders.toArray());
    }
}
