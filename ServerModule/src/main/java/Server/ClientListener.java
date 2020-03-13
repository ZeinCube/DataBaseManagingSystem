package Server;

import Engine.API;
import Logic.ParserManager;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ClientListener extends Thread {
    private Socket socket;
    private DataInputStream is;
    private DataOutputStream os;
    private API api;
    private ParserManager manager = new ParserManager();

    public ClientListener(Socket socket) throws Exception {
        this.socket = socket;
        try {
            is = new DataInputStream(socket.getInputStream());
            os = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            socket.close();
            System.err.println("No connection");
        }

        start();
    }

    @Override
    public void run() {
        while (!isInterrupted() && !socket.isClosed()) {
            try {
                String message = is.readUTF();
                os.writeUTF(manager.Parse(message));
                os.flush();
            } catch (IOException e) {
                System.err.println("No connection :" + e.getMessage());
            }
        }
    }
}
