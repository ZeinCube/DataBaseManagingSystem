package Engine.Exceptions;

public class DBMSException extends Exception {
    private String className;

    public DBMSException(String m) {
        super(m);
        className = this.getClass().toString();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getMessage() {
        return this.className + '\n' + super.getMessage();
    }
}
