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
        while (scanner.hasNextLine()) {
            List<String> tokens = new ArrayList<>();
            Scanner lineScanner = new Scanner(System.in);

            while (lineScanner.hasNextLine()) {
                tokens.add(lineScanner.nextLine());
            }

            String result = "";

            for (String s: tokens) {
                result.concat(s);
            }

            try {
                os.writeUTF(result);
            } catch (IOException e) {
                listener.interrupt();
                System.err.println(e.getMessage());
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
