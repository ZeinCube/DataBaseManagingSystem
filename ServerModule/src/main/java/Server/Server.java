package Server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;

public class Server {
    private static ServerSocket mainSocket;
    static InetAddress ADDRESS;

    public static void main(String[] args) throws IOException {
        setAddress("localhost");
        System.out.println("Server is running on IP: " + ADDRESS.getHostAddress());
        try {
            mainSocket = new ServerSocket(3309, 0, ADDRESS);
        } catch (IOException e) {
            System.err.println("Could not start server " + e.getMessage());
        }

        while (!mainSocket.isClosed()) {
            try {
                new ClientListener(mainSocket.accept());
            } catch (Exception e) {
                System.err.println(e.getMessage());
                mainSocket.close();
                System.exit(1);
            }
        }
    }

    public static void setAddress(String address) {
        try {
            ADDRESS = InetAddress.getByName(address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
