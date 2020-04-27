package Test.Exceptions;

public class ClientDownException extends Exception {
    public ClientDownException() {
        super("DBMSClient.Client is down");
    }

    public ClientDownException(String message) {
        super(message);
    }
}
