package Test.Utils;

import java.io.*;

public class ClientHelper {
    public static String CLIENT_JAR;

    private Process client;

    private PrintWriter clientWriter;
    private BufferedReader clientReader;

    public ClientHelper() {
        runClient();
    }

    public void runClient() {
        try {
            while (!ServerHelper.getServerStatus())
                Thread.sleep(100);

            client = Runtime.getRuntime().exec("java -jar " + CLIENT_JAR);
            clientReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            clientWriter = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException | InterruptedException e) {
            Printer.printError(e);
            System.exit(0);
        }
    }

    public void stopClient() {
        try {
            clientReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clientWriter.close();
        client.destroy();
    }

    public void restartClient() {
        stopClient();
        runClient();
    }

    public String communicate(String query) {
        clientWriter.println(query);
        clientWriter.flush();

        try {
            StringBuilder builder = new StringBuilder();

            while(true) {
                String s = clientReader.readLine().trim();
                if (s.equals(".done.")) {
                    break;
                }

                builder.append(s).append("\n");
            }

            return builder.toString();
        } catch (IOException e) {
            Printer.printError(e);
            return e.getMessage();
        }
    }

    public boolean getClientStatus() {
        return client.isAlive() && client != null;
    }
}
