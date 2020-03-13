package Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static Socket socket;
    private static int port = 3309;
    private static DataOutputStream os;
    private static ServerListener listener;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        connect("localhost");

        while (true) {
            List<String> tokens = new ArrayList<>();

            Scanner lineScanner = new Scanner(System.in);
            System.out.print("# ");
            while (lineScanner.hasNextLine()) {
                String s = lineScanner.nextLine();
                tokens.add(s);

                if (s.endsWith(";")) break;
                System.out.print("  >>");
            }

            String result = "";
            for (String s : tokens) {
                result = result.concat(s);
            }

            String[] queries = result.split(";");

            for (String s: queries) {
                if (s.equals("exit") || s.equals("quit")) {
                    break;
                }

                try {
                    os.writeUTF(s);
                } catch (IOException e) {
                    listener.interrupt();
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    public static void connect(String host) {
        try {
            socket = new Socket(InetAddress.getByName(host), port);
            DataInputStream is = new DataInputStream(socket.getInputStream());
            System.out.println("Connected to port " + port);
            os = new DataOutputStream(socket.getOutputStream());
            listener = new ServerListener(is);
        } catch (Exception e) {
            System.err.println("No connection cause: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Socket getSocket() {
        return socket;
    }
}
