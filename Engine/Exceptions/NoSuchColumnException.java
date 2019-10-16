package Exceptions;

public class NoSuchColumnException extends DBMSException {
    public NoSuchColumnException(String m) {
        super(m);
    }
}
