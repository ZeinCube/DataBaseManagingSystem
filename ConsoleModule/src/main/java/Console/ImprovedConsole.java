package Console;

import Logic.ImprovedParserManager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ImprovedConsole {

    public static void main(String[] args) throws Exception {
        ImprovedParserManager manager = new ImprovedParserManager();
        if (args.length > 0) {
            for (String arg: args) {
                if ((new File(arg)).exists()) {
                    FileInputStream fin = new FileInputStream(args[0]);
                    Scanner scanner = new Scanner(fin);

                    String query = "";
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine().trim();
                        if (!line.endsWith(";")) {
                            query = query.concat(line + " ");
                        } else {
                            manager.parse(query);
                            query = "";
                        }
                    }
                }
            }
        } else {
            runShell(manager);
        }
    }

    private static void runShell(ImprovedParserManager manager) {
        Scanner scanner = new Scanner(System.in);

        String query = "";

        System.out.print(">> ");
        while (true) {
            String line = scanner.nextLine();

            if (line.isEmpty()) continue;
            if (line.equals("exit")) break;

            if (!line.endsWith(";")) {
                query = query.concat(line + " ");
                System.out.print("\t>> ");
            } else {
                System.out.print(manager.parse(query));
                System.out.print(">> ");
                query = "";
            }
        }
    }
}
