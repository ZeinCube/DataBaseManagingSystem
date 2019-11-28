package Console;

import Engine.API;
import Engine.DBEngine;
import Engine.Entity.Column;
import Logic.ParserManager;

import java.util.HashSet;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ParserManager manager = new ParserManager();

        while (true) {
            manager.Parse(scanner.nextLine());
        }
    }
}