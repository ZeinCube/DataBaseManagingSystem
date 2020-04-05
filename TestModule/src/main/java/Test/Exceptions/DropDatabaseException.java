package Test.Exceptions;

/**
 * Can not perform database removing
 */
public class DropDatabaseException extends Exception {
    public DropDatabaseException() {
        super("Error occurred while dropping database");
    }

    public DropDatabaseException(String message) {
        super(message);
    }
}
