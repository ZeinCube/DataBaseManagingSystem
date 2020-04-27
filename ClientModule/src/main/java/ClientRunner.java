import java.util.Scanner;

public class ClientRunner {
    public static void main(String[] args) {
        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            StringBuilder builder = new StringBuilder();

            System.out.print("# ");
            String line = scanner.nextLine().trim();

            if (line.equals("exit")) {
                client.disconnect();
                break;
            }

            builder.append(line);

            while (!line.endsWith(";")) {
                System.out.print("\t> ");
                line = scanner.nextLine().trim();
                builder.append(" ").append(line);
            }

            String[] queries = builder.toString().split(";");
            for (String q : queries) {
                System.out.println(client.communicate(q));
            }
        }
    }
}
