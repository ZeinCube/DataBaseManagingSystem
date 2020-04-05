package Test.Exceptions;

/**
 * Test result is wrong (expected or result string is null or not equals)
 */
public class TestWrongResultException extends Exception {
    public TestWrongResultException() {
        super("Wrong test result");
    }

    public TestWrongResultException(String message) {
        super(message);
    }
}
