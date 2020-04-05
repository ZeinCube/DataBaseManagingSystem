package Test.Utils;

import java.io.*;

/**
 * ClientServer work helper
 * Set PROJECT_PATH before use
 *
 * @author hehogcode
 * @version 1.0.0
 */
public class CSWorker {
    public static String PROJECT_PATH;

    public static final String CLIENT_JAR = "ClientModule/target/Client-1.0.0-jar-with-dependencies.jar";
    public static final String SERVER_JAR = "ServerModule/target/Server-1.0.0-jar-with-dependencies.jar";

    private static Process server;
    private static Process client;

    private static PrintWriter clientWriter;
    private static BufferedReader clientReader;

    public static void RunServer() {
        try {
            server = Runtime.getRuntime().exec("java -jar " + PROJECT_PATH + SERVER_JAR);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void StopServer() {
        server.destroy();
    }

    public static void RestartServer() {
        StopServer();
        RunServer();
    }

    public static void RunClient() {
        try {
            client = Runtime.getRuntime().exec("java -jar " + PROJECT_PATH + CLIENT_JAR);
            clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            clientWriter = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void StopClient() {
        try {
            clientReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clientWriter.close();
        client.destroy();
    }

    public static void RestartClient() {
        StopClient();
        RunClient();
    }

    public static void RunClientServer() {
        RunServer();
        RunClient();
    }

    public static void StopClientServer() {
        StopClient();
        StopServer();
    }

    public static void RestartClientServer() {
        StopClientServer();
        RunClientServer();
    }

    public static Process RunAndReturnClient() throws IOException {
        return Runtime.getRuntime().exec("java -jar " + PROJECT_PATH + CLIENT_JAR);
    }

    public static String Communicate(String query) {
        clientWriter.println(query);
        clientWriter.flush();

        try {
            return clientReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
