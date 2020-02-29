package Test.Engine;

import Test.Utils.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class TestCli {
    private TestEngine engine;

    public TestCli() {
        engine = new TestEngine();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Printer.print_shell_prompt();
            String[] command = scanner.nextLine().split(" ");

            if (command.length == 0) continue;

            if (command.length == 1 && (command[0].equals("exit") || command[0].equals("quit"))) {
                return;
            } else {
                parse_command(command);
            }
        }
    }

    private void parse_command(String[] command) {
        int len = command.length;
        String[] args = len > 1 ? Arrays.copyOfRange(command, 1, command.length) : new String[]{};

        switch (command[0]) {
            case "run":
                if (!check_args_len(len)) break;

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
                if (len != 1)
                    Printer.print_error("Unknown arguments after list command");

                engine.listTests();
                break;
            case "create":
                if (check_args_len(len))
                    engine.createTest(args);
                break;
            case "delete":
            case "remove":
                if (check_args_len(len))
                    engine.removeTests(args);
                break;
            case "show":
                if (check_args_len(len))
                    engine.showResults(args);
                break;
            case "cls":
            case "clear":
                if (len != 1) {
                    Printer.print_error("Too many arguments");
                } else {
                    Printer.clear();
                }

                break;
            default:
                Printer.print_error("Unknown command");
        }
    }

    private boolean check_args_len(int len) {
        if (len < 2) {
            Printer.print_error("Give name(s) of test(s)");
        }

        return len >= 2;
    }
}
