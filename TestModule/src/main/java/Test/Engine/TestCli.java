package Test.Engine;

import Test.Utils.Printer;

import java.util.Arrays;
import java.util.Scanner;


/**
 * class TestCli
 * Cli interface for Tester
 */
public class TestCli {
    private TestCliEngine engine;

    public TestCli() {
        engine = new TestCliEngine();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Printer.printShellPrompt();
            String[] command = scanner.nextLine().split(" ");

            if (command.length == 0) continue;

            if (command.length == 1 && (command[0].equals("exit") || command[0].equals("quit"))) {
                return;
            } else {
                parseCommand(command);
            }
        }
    }

    private void parseCommand(String[] command) {
        int len = command.length;
        String[] args = len > 1 ? Arrays.copyOfRange(command, 1, command.length) : new String[]{};

        switch (command[0]) {
            case "run":
                if (!checkArgsLen(len)) break;

                boolean run_all_flag = false;
                for (String arg : args) {
                    if (arg.equals("all")) {
                        run_all_flag = true;
                        break;
                    }
                }

                if (run_all_flag) {
                    engine.runAllTests();
                    break;
                }

                engine.runTests(args);
                break;
            case "list":
            case "lst":
            case "dir":
            case "ls":
                if (len != 1)
                    Printer.printError("Unknown arguments after list command");

                engine.listTests();
                break;
            case "create":
            case "new":
                if (checkArgsLen(len))
                    engine.createTest(args);
                break;
            case "delete":
            case "remove":
            case "del":
            case "rm":
                if (checkArgsLen(len))
                    engine.removeTests(args);
                break;
            case "cls":
            case "clear":
                if (len != 1) {
                    Printer.printError("Too many arguments");
                } else {
                    Printer.clear();
                }

                break;
            default:
                Printer.printError("Unknown command");
        }
    }

    private boolean checkArgsLen(int len) {
        if (len < 2) {
            Printer.printError("Give name(s) of test(s)");
        }

        return len >= 2;
    }
}
