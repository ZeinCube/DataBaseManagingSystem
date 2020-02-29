package Test.Utils;

import java.io.*;
import java.util.Scanner;

public class Configurator {

    private File config;
    private String TESTS_FOLDER;

    public Configurator() {
        Printer.printInfo("Initializing configuration");

        config = new File(System.getProperty("user.home") + "/.dbms_tests_config");

        try {
            if (!config.exists()) {
                Printer.printInfo("Creating new configuration");
                config.createNewFile();
                createConfig();
                Printer.printInfo("Configuration created");
            } else {
                loadConfig();
                Printer.printInfo("Configuration loaded");
            }
        } catch (IOException e) {
            Printer.printCriticalError(e.getMessage());
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

        Printer.printCriticalError("Incorrect config file on path" + config.getAbsolutePath());
    }

    private void createConfig() throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Printer.printQuestion("Input test directory path");
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
                Printer.printError("Incorrect folder path");
            }
        }
    }

    private boolean checkTestsFolder() {
        File tests_folder = new File(TESTS_FOLDER);
        return tests_folder.exists() && tests_folder.isDirectory();
    }
}
