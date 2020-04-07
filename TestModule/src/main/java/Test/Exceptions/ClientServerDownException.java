package Test.Exceptions;


public class ClientServerDownException extends Exception {
    public ClientServerDownException() {
        super("Client or Server is down");
    }

    public ClientServerDownException(String message) {
        super(message);
    }
}
