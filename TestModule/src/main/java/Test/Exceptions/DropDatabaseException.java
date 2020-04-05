package Test.Exceptions;

public class DropDatabaseException extends Exception {
    public DropDatabaseException(String message) {
        super(message);
    }
}
