package Test.Utils;

import java.io.*;
import java.util.Scanner;

public class Configurator {

    private File config;
    private String TESTS_FOLDER;

    public Configurator() {
        Printer.print_info("Initializing configuration");

        config = new File(System.getProperty("user.home") + "/.dbms_tests_config");

        try {
            if (!config.exists()) {
                Printer.print_info("Creating new configuration");
                config.createNewFile();
                createConfig();
                Printer.print_info("Configuration created");
            } else {
                loadConfig();
                Printer.print_info("Configuration loaded");
            }
        } catch (IOException e) {
            Printer.print_critical_error(e.getMessage());
        }
    }

    public String getTESTS_FOLDER() {
        return TESTS_FOLDER;
    }

    private void loadConfig() throws FileNotFoundException {
        Scanner scanner = new Scanner(config);
        String[] input = scanner.nextLine().split("=");
        if (input.length == 2) {
            TESTS_FOLDER = input[1];
            if (checkTestsFolder()) {
                return;
            }
        }

        Printer.print_critical_error("Incorrect config file on path" + config.getAbsolutePath());
    }

    private void createConfig() throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Printer.print_question("Input test directory path");
            TESTS_FOLDER = scanner.nextLine();

            if (TESTS_FOLDER.charAt(TESTS_FOLDER.length() - 1) != '/') {
                TESTS_FOLDER += '/';
            }

            if (checkTestsFolder()) {
                FileOutputStream fout = new FileOutputStream(config);
                fout.write(("TESTS_FOLDER=" + TESTS_FOLDER + "\n").getBytes());
                fout.close();
                break;
            } else {
                Printer.print_error("Incorrect folder path");
            }
        }
    }

    private boolean checkTestsFolder() {
        File tests_folder = new File(TESTS_FOLDER);
        return tests_folder.exists() && tests_folder.isDirectory();
    }
}
