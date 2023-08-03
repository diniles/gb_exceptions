package seminar3.exceptions;

public class IllegalParametersQuantityException extends RuntimeException {
    public IllegalParametersQuantityException(String message) {
        super("Illegal arguments quantity: " + message);
    }
}
