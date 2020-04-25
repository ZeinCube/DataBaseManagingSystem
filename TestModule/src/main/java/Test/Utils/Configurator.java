package Test.Utils;

import Test.Exceptions.BadConfigException;
import Test.Exceptions.ServerDownException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Configurator {

    private final File config;
    private String TESTS_FOLDER;

    public Configurator() {
        Printer.printInfo("Initializing configuration");

        Printer.printInfo("Checking server status");
        if (!ServerHelper.getServerStatus())
            Printer.printCriticalErrorAndExit(new ServerDownException());
        Printer.printInfo("Server OK");

        config = new File(System.getProperty("user.home") + "/.dbms_tests_config");

        try {
            if (!config.exists()) {
                Printer.printInfo("Creating new configuration");

                boolean flag = config.createNewFile();
                if (!flag) Printer.printCriticalErrorAndExit(new BadConfigException("Can not create config file"));

                createConfig();

                Printer.printInfo("Configuration created");
            } else {
                loadConfig();
                Printer.printInfo("Configuration loaded");
            }
        } catch (IOException e) {
            Printer.printCriticalErrorAndExit(e);
        }
    }

    public String getTESTS_FOLDER() {
        return TESTS_FOLDER;
    }

    private void loadConfig() {
        try {
            Scanner scanner = new Scanner(config);
            String[] input = scanner.nextLine().split("=");
            if (input.length == 2) {
                TESTS_FOLDER = input[1];
                if (!checkTestsFolder()) {
                    throw new BadConfigException("Incorrect config file on path " + config.getAbsolutePath());
                }
            }
        } catch (NoSuchElementException | BadConfigException | FileNotFoundException e) {
            Printer.printCriticalErrorAndExit(e);
        }
    }

    private void createConfig() throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Printer.printQuestion("Input test directory path");
            TESTS_FOLDER = scanner.nextLine();
            TESTS_FOLDER = TESTS_FOLDER.replaceAll("\\\\", "/");

            if (TESTS_FOLDER.charAt(TESTS_FOLDER.length() - 1) != '/') {
                TESTS_FOLDER = TESTS_FOLDER.concat("/");
            }

            if (checkTestsFolder()) {
                FileOutputStream configOutputStream = new FileOutputStream(this.config);
                configOutputStream.write(("TESTS_FOLDER=" + TESTS_FOLDER + "\n").getBytes());
                configOutputStream.close();
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

    public String getTestFolder(String testName) {
        String test_folder_path = TESTS_FOLDER + testName + "/";

        if (!(new File(test_folder_path).exists())) {
            return null;
        }

        return test_folder_path;
    }

    public String getTempFolder() {
        String tmp = TESTS_FOLDER + "temp/";
        File tmpFolder = new File(tmp);
        if (!tmpFolder.exists()) {
            tmpFolder.mkdirs();
        }

        return tmp;
    }
}
