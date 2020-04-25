package Console;

import Logic.ParserManager;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) throws Exception {
        ParserManager manager = new ParserManager();
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

    private static void runShell(ParserManager manager) {
        Scanner scanner = new Scanner(System.in);

        String query = "";

        System.out.print("# ");
        while (true) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) continue;
            if (line.equals("exit")) break;

            query = query.concat(line + " ");

            if (!line.endsWith(";")) {
                System.out.print("\t> ");
            } else {
                System.out.println(manager.parse(query.trim()).trim());
                System.out.print("# ");
                query = "";
            }
        }
    }
}
