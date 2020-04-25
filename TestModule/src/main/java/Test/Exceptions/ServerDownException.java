package Test.Exceptions;

public class ServerDownException extends Exception {
    public ServerDownException() {
        super("Server is down");
    }

    public ServerDownException(String message) {
        super(message);
    }
}
