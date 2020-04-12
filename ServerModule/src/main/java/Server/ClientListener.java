package Server;

import Engine.API;
import Logic.ImprovedParserManager;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientListener extends Thread {
    private Socket socket;
    private DataInputStream is;
    private DataOutputStream os;
    private ImprovedParserManager manager = new ImprovedParserManager();

    public ClientListener(Socket socket) throws Exception {
        this.socket = socket;
        try {
            is = new DataInputStream(socket.getInputStream());
            os = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            socket.close();
            System.err.println("No connection");
        }

        System.out.println("Connected client on IP " + socket.getInetAddress() + "|" + socket.getPort());

        start();
    }

    @Override
    public void run() {
        while (!isInterrupted() && !socket.isClosed()) {
            try {
                String message = is.readUTF();

                if (message.equals("exit") || message.equals("quit")) {
                    System.out.println("Disconnected client on IP " + socket.getInetAddress() + "|" + socket.getPort());
                    break;
                }

                os.writeUTF(manager.parse(message).trim());
                os.flush();
            } catch (IOException e) {
                System.err.println("No connection: " + e.getMessage());
            }
        }
    }
}
