package ua.hillel.oop.exception;

public class InvalidChoice extends Exception{
    public InvalidChoice() {
    }

    public InvalidChoice(String message) {
        super(message);
    }

    public InvalidChoice(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidChoice(Throwable cause) {
        super(cause);
    }
}
