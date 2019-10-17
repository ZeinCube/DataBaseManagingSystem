import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Слушает комады от клиента
 */
public class ClientListener extends Thread {
    private Socket socket;
    private DataInputStream is;

    public ClientListener(Socket socket) throws IOException {
        this.socket = socket;

        try {
            is = new DataInputStream(socket.getInputStream());
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
                String command = is.readUTF(); //КОМАНДА КОТОРУЮ СЧИТАЛИ
                //TODO : обработать команду в парсере
            } catch (IOException e) {
                System.err.println("No connection :" + e.getMessage());
            }
        }
    }
}
