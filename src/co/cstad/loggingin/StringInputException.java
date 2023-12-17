package co.cstad.exception;

public class StringInputException extends RuntimeException {

    public StringInputException() {
        super();
    }

    public StringInputException(String message) {
        super(message);
    }

    public StringInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public StringInputException(Throwable cause) {
        super(cause);
    }
}