import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private final int BUFFER_SIZE = 2048;

    private Socket socket;

    private String hostname = "localhost";
    private int port = 10274;

    private DataOutputStream outputStream;
    private DataInputStream inputStream;
    private Scanner scanner = new Scanner(System.in);


    public Client() {
        connect();
    }

    public Client(int port) {
        this.port = port;
        connect();
    }

    public Client(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
        connect();
    }

    public String communicate(String query) {
        StringBuilder result = new StringBuilder();

        try {
            outputStream.write(query.getBytes());
            outputStream.flush();

            if (query.equals("exit")) {
                disconnect();
            }

            while (inputStream.available() <= 0) ;

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.available() > 0) {
                inputStream.read(buffer);
                result.append(new String(buffer));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            reconnect();
        }

        return result.toString().trim();
    }

    public void reconnect() {
        System.out.println("Trying to reconnect");
        connect();
    }

    public void disconnect() {
        try {
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        System.out.println("Connection closed");
        System.exit(0);
    }

    private void connect() {
        try {
            socket = new Socket(InetAddress.getByName(hostname), port);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            System.out.println("Connected to DBMS Server on port: " + port);
        } catch (Exception e) {
            System.err.println("Connection failed. Trying again");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException interruptedException) {
                System.err.println("Critical error: " + interruptedException.getMessage());
                System.exit(0);
            }

            connect();
        }
    }
}
