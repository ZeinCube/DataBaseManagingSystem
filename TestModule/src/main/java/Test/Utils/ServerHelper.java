package Test.Utils;

import java.io.*;

public class ServerHelper {
    public static String SERVER_JAR;

    private static Process server;

    public static void runServer() {
        try {
            server = Runtime.getRuntime().exec("java -jar " + SERVER_JAR);
        } catch (IOException e) {
            Printer.printError(e);
            System.exit(0);
        }
    }

    public static void stopServer() {
        server.destroy();
    }

    public static void forceRestartServer() {
        server.destroyForcibly();
        runServer();
    }

    public static boolean getServerStatus() {
        return server.isAlive() && server != null;
    }

    public static int getServerIdentityId() {
        return System.identityHashCode(server);
    }
}
