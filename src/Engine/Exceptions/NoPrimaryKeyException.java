package Engine.Exceptions;

public class NoPrimaryKeyException extends DBMSException {

    public NoPrimaryKeyException() {
        super("No Primary Key Introduced");
    }
}
