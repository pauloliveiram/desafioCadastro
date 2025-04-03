package exceptions;

public class InvalidCompleteNameException extends RuntimeException {
    public InvalidCompleteNameException(String message) {
        super(message);
    }
}
