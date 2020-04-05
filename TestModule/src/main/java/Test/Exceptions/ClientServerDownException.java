package Test.Exceptions;

public class ClientServerDownException extends Exception {
    public ClientServerDownException(String message) {
        super(message);
    }

    public ClientServerDownException() {
        super("Client or Server is down");
    }
}
