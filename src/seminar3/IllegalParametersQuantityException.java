package seminar3;

public class IllegalParametersQuantityException extends RuntimeException {
    public IllegalParametersQuantityException(String message) {
        super("Illegal arguments quantity: " + message);
    }
}
