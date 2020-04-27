package Test.Utils;

import DBMSClient.Client;

public class ClientHelper {
    private Client client;

    public ClientHelper() {
        client = new Client(Printer.getEmptyPrintStream(), Printer.getEmptyPrintStream());
    }

    public void stopClient() {
        client.disconnect();
    }

    public boolean getClientStatus() {
        return client.getStatus();
    }

    public String communicate(String query) {
        return client.communicate(query);
    }
}
