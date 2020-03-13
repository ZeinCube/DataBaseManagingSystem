package Test.Engine;

import Test.Utils.Printer;;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestCliEngine {

    private String DB_NAME = "DataBaseManagingSystem";
    private Tester tester;

    public TestCliEngine() {
        Printer.printDelimiter();
        Printer.printTask("Initializing Tester instance");

        tester = new Tester();

        Printer.printInfo("Tests folder: " + tester.getConfigurator().getTESTS_FOLDER());
        Printer.printDelimiter();
    }

    public void createTest(String[] testNames) {
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
            }

        }
    }

    public void listTests() {
        for (String f : new File(tester.getConfigurator().getTESTS_FOLDER()).list()) {
            Printer.printListElement(f);
        }
    }

    public void removeTests(String[] testNames) {
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
                }
            } else {
                Printer.printError("Test not found <" + name + ">");
            }
        }
    }

    public void runTests(String[] testNames) {
        for (String testName : testNames) {
            Printer.printTask("Running test <" + testName + ">");
            tester.test(testName);
        }
    }

    public void showResults(String[] testNames) {
        System.out.println("show_results");
    }

    public void runAllTests() {
        Printer.printTask("Running all tests");
        runTests(new File(tester.getConfigurator().getTESTS_FOLDER()).list());
    }
}
