import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.util.Collections;
import java.util.List;

public class Server {
    private static ServerSocket mainSocket;
    static InetAddress ADDRESS;
    static String ifases = null;


    public static void main(String[] args) throws IOException {
        setAddress();

        try {
            mainSocket = new ServerSocket();
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

    private static void setAddress() throws IOException {
        ifases = "\nINTERFACES:";
        try {
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface intf : interfaces) {
                ifases += "\n     " + intf.getName() + ": ";
                List<InetAddress> addrs = Collections.list(intf.getInetAddresses());
                for (int i = 0; i < addrs.size(); i++) {
                    InetAddress ipAddress = addrs.get(i);
                    ifases += ipAddress.getHostAddress() + (i == addrs.size() - 1 ? "" : ", ");
                    if (!ipAddress.isLoopbackAddress() & !ipAddress.isLinkLocalAddress() & !ipAddress.getHostAddress().contains(":")) {
                        ADDRESS = ipAddress;
                        break;
                    }
                }
            }
            ifases += "\n----end of interfaces----";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            mainSocket.close();
            System.exit(1);
        }
    }
}
