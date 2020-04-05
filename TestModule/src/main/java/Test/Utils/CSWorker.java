package Test.Utils;

import java.io.*;

/**
 * Class CSWorker
 * Client Server helper
 * Set PROJECT_PATH before use
 */
public class CSWorker {
    public static String PROJECT_PATH;

    public static final String CLIENT_JAR = "ClientModule/target/Client-1.0.0-jar-with-dependencies.jar";
    public static final String SERVER_JAR = "ServerModule/target/Server-1.0.0-jar-with-dependencies.jar";

    private static Process server;
    private static Process client;

    private static PrintWriter clientWriter;
    private static BufferedReader clientReader;

    public static void runServer() {
        try {
            server = Runtime.getRuntime().exec("java -jar " + PROJECT_PATH + SERVER_JAR);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void stopServer() {
        server.destroy();
    }

    public static void restartServer() {
        stopServer();
        runServer();
    }

    public static void runClient() {
        try {
            client = Runtime.getRuntime().exec("java -jar " + PROJECT_PATH + CLIENT_JAR);
            clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            clientWriter = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void stopClient() {
        try {
            clientReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clientWriter.close();
        client.destroy();
    }

    public static void restartClient() {
        stopClient();
        runClient();
    }

    public static void runClientServer() {
        runServer();
        runClient();
    }

    public static void stopClientServer() {
        stopClient();
        stopServer();
    }

    public static void restartClientServer() {
        stopClientServer();
        runClientServer();
    }

    public static Process runAndReturnClient() throws IOException {
        return Runtime.getRuntime().exec("java -jar " + PROJECT_PATH + CLIENT_JAR);
    }

    public static String communicate(String query) {
        clientWriter.println(query);
        clientWriter.flush();

        try {
            return clientReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean getClientStatus() {
        return client.isAlive();
    }

    public static boolean getServerStatus() {
        return server.isAlive();
    }
}
