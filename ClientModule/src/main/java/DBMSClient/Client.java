package DBMSClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private final int BUFFER_SIZE = 2048;

    private Socket socket;

    private String hostname = "localhost";
    private int port = 10274;

    private PrintStream printStream = System.out;
    private PrintStream errorStream = System.err;
    private DataOutputStream outputStream;
    private DataInputStream inputStream;

    public Client(PrintStream printStream, PrintStream errorStream) {
        this.printStream = printStream;
        this.errorStream = errorStream;
        connect();
    }

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
            errorStream.println(e.getMessage());
            result = new StringBuilder("Connection lost");
            reconnect();
        }

        return result.toString().trim();
    }

    public boolean getStatus() {
        return !socket.isClosed();
    }

    public void reconnect() {
        if (!getStatus()) {
            printStream.println("Trying to reconnect");
            connect();
        }
    }

    public void disconnect() {
        try {
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            errorStream.println("Exception: " + e.getMessage());
        }

        printStream.println("Connection closed");
    }

    private void connect() {
        try {
            socket = new Socket(InetAddress.getByName(hostname), port);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            printStream.println("Connected to DBMS Server on port: " + port);
        } catch (Exception e) {
            errorStream.println("Connection failed. Trying again");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException interruptedException) {
                errorStream.println("Critical error: " + interruptedException.getMessage());
            }

            connect();
        }
    }
}
