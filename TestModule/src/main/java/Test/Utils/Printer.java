package Test.Utils;

public class Printer {

    public static final String DELIMITER =
            "--------------------------------------------------------------------------------";

    public static final String RESET = "\u001B[0m";
    public static final String CLEAR = "\033[H\033[2J";

    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

    public static final String BACKGROUND_BLACK = "\u001B[40m";
    public static final String BACKGROUND_RED = "\u001B[41m";
    public static final String BACKGROUND_GREEN = "\u001B[42m";
    public static final String BACKGROUND_YELLOW = "\u001B[43m";
    public static final String BACKGROUND_BLUE = "\u001B[44m";
    public static final String BACKGROUND_PURPLE = "\u001B[45m";
    public static final String BACKGROUND_CYAN = "\u001B[46m";
    public static final String BACKGROUND_WHITE = "\u001B[47m";


    public static void print_message(String msg) {
        System.out.println(msg);
    }

    public static void print_shell_prompt() {
        System.out.print(BACKGROUND_CYAN + TEXT_BLACK + "test_framework#" + RESET + " ");
    }

    public static void print_error(String msg) {
        System.out.println(TEXT_RED + "[ERROR] " + RESET + msg);
    }

    public static void print_critical_error(String msg) {
        System.out.println(BACKGROUND_RED + TEXT_BLACK + "[CRITICAL]" + RESET + " " + msg);
        System.exit(0);
    }

    public static void print_info(String msg) {
        System.out.println(TEXT_BLUE + "[INFO] " + RESET + msg);
    }

    public static void print_list_element(String msg) {
        System.out.println("-> " + msg);
    }

    public static void print_delimiter() {
        System.out.println(TEXT_YELLOW + DELIMITER + RESET);
    }

    public static void print_question(String msg) {
        System.out.print(msg + ": ");
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
