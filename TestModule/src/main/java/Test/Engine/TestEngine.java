package Test.Engine;

import Test.Utils.Configurator;
import Test.Utils.Printer;;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestEngine {

    private String DB_NAME = "DataBaseManagingSystem";
    private Configurator config;

    public TestEngine() {
        Printer.print_delimiter();
        Printer.print_info("Initializing TestEngine instance");

        config = new Configurator();

        Printer.print_info("Tests folder: " + config.getTESTS_FOLDER());
        Printer.print_delimiter();
    }


    public void createTest(String[] testNames) {
        for (String name : testNames) {
            Printer.print_info("Creating test <" + name + ">");

            String test_dir = config.getTESTS_FOLDER().concat(name);
            String test_results_dir = test_dir.concat("/results");
            String test_expected_dir = test_dir.concat("/expected");

            new File(test_dir).mkdirs();
            new File(test_results_dir).mkdirs();
            new File(test_expected_dir).mkdirs();

            try {
                new File(test_dir.concat("/test.in")).createNewFile();
                new File(test_expected_dir.concat("/test.out")).createNewFile();
            } catch (IOException e) {
                Printer.print_critical_error(e.getMessage());
            }

            Printer.print_info("Test <" + name + "> created");
        }
    }

    public void listTests() {
        for (String f : new File(config.getTESTS_FOLDER()).list()) {
            Printer.print_list_element(f);
        }
    }


    public void removeTests(String[] testNames) {
        for (String name : testNames) {
            Printer.print_info("Deleting test <" + name + ">");
            File testFolder = new File(config.getTESTS_FOLDER() + name);
            if (testFolder.exists()) {
                try {
                    Files.walk(Paths.get(String.valueOf(testFolder)))
                            .map(Path::toFile)
                            .sorted((o1, o2) -> -o1.compareTo(o2))
                            .forEach(File::delete);
                } catch (IOException e) {
                    Printer.print_critical_error(e.getMessage());
                }
                Printer.print_info("Test <" + name + "> deleted");
            } else {
                Printer.print_error("Test not found <" + name + ">");
            }
        }
    }


    public void runTests(String[] testNames) {
        System.out.println("run_test");
    }


    public void showResults(String[] testNames) {
        System.out.println("show_results");
    }


    public void runAllTests() {
        Printer.print_info("Running all tests");
        runTests(new File(config.getTESTS_FOLDER()).list());
    }
}
