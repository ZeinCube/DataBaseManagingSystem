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
                    while (scanner.hasNextLine()) {
                        manager.Parse(scanner.nextLine());
                    }
                }
            }
        } else {
            run_shell(manager);
        }
    }

    private static void run_shell(ImprovedParserManager manager) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty() || line.equals("exit")) {
                break;
            }

            manager.Parse(line);
        }
    }
}
