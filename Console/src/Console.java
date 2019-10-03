import pars.Parser;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String sql = scanner.nextLine();
            parser.pars(sql.toLowerCase());
        }
    }
}
