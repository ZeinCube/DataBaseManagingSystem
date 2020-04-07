package Test.Exceptions;


public class TestWrongResultException extends Exception {
    public TestWrongResultException() {
        super("Wrong test result");
    }

    public TestWrongResultException(String message) {
        super(message);
    }
}
