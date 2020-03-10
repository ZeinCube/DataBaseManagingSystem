package Test.Utils;

public class Printer {

    public static final String DELIMITER =
            "--------------------------------------------------------------------------------";

    public static final String RESET = "\u001B[0m";
    public static final String CLEAR = "\033[H\033[2J";

    public static final String TEXT_BRIGHT_RED = "\u001b[31;1m";
    public static final String TEXT_BRIGHT_YELLOW = "\u001b[33;1m";
    public static final String TEXT_BRIGHT_GREEN = "\u001b[32;1m";
    public static final String TEXT_BRIGHT_BLUE = "\u001b[34;1m";
    public static final String TEXT_BRIGHT_WHITE = "\u001b[37;1m";

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

    public static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static void printShellPrompt() {
        System.out.print(BACKGROUND_CYAN + TEXT_WHITE + "test_framework#" + RESET + " ");
    }

    public static void printError(String msg) {
        System.out.println(TEXT_BRIGHT_RED + "[ERROR] " + RESET + msg);
    }

    public static void printError(Exception e) {
        System.out.println(TEXT_BRIGHT_RED + "[ERROR] " + RESET + " " + e.getClass() + ": " + e.getMessage());
    }

    public static void printCriticalError(Exception e) {
        System.out.println(BACKGROUND_RED + TEXT_BLACK + "[CRITICAL]" + RESET + " " + e.getClass() + ": " + e.getMessage());
    }

    public static void printCriticalErrorAndExit(Exception e) {
        printCriticalError(e);
        System.exit(0);
    }

    public static void printInfo(String msg) {
        System.out.println(TEXT_BRIGHT_BLUE + "[INFO] " + RESET + msg);
    }

    public static void printListElement(String msg) {
        System.out.println("-> " + msg);
    }

    public static void printDelimiter() {
        System.out.println(TEXT_BRIGHT_YELLOW + DELIMITER + RESET);
    }

    public static void printQuestion(String msg) {
        System.out.print(msg + ": ");
    }

    public static void printTask(String msg) {
        System.out.println(TEXT_BRIGHT_YELLOW + "[Task]" + RESET + " " + msg);
    }

    public static void printTest(String query, String result) {
        System.out.println(TEXT_PURPLE + "[TestQuery]" + RESET + "\n" + "\tQuery: " + query + "\n" + "\tResult: " + result);
    }

    public static void printTestError(Exception e, String expected, String result) {
        System.out.println(TEXT_RED + "[TestError] " + RESET + "\n" + "\tExpected: " + expected + "\n" + "\tResult: " + result);
    }

    public static void printTestError(String msg) {
        System.out.println(TEXT_RED + "[TestError] " + RESET + msg);
    }

    public static void printTestInfo(String msg) {
        System.out.println(TEXT_BLUE + "[TestInfo] " + RESET + msg);
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
