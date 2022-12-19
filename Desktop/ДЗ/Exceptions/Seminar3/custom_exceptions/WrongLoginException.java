package Seminar3.custom_exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException(String msg) {
        super(msg);
    }

    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
