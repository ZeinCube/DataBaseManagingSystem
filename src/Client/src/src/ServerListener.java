package src;

import java.io.DataInputStream;
import java.io.IOException;

public class ServerListener extends Thread {
    private DataInputStream is;

    public ServerListener(DataInputStream is) {
        this.is = is;
        start();
    }

    @Override
    public void run() {
        while (!isInterrupted() & !Client.getSocket().isClosed()) {
            try {
                System.out.println(is.readUTF());
            } catch (IOException e) {
                System.err.println(e.getMessage());
                interrupt();
            }
        }
    }
}
