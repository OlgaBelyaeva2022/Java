package Seminar3.custom_exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String msg) {
        super(msg);
    }

    public WrongPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
