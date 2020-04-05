package Test.Exceptions;

/**
 * Config not found/Can not create config file/etc...
 */
public class BadConfigException extends Exception {
    public BadConfigException() {
        super("Something wrong with your config");
    }

    public BadConfigException(String message) {
        super(message);
    }
}
