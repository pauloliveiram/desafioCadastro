package exceptions;

public class NameOrLastNameNotFound extends RuntimeException {
    public NameOrLastNameNotFound(String message) {
        super(message);
    }
}
