package Console;

import Logic.ParserManager;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParserManager manager = new ParserManager();

        while (true) {
            manager.Parse(scanner.nextLine());
        }
    }
}