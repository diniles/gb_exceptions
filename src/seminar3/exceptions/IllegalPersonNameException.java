package seminar3.exceptions;

public class IllegalPersonNameException extends RuntimeException {
    public IllegalPersonNameException(String message) {
        super("Invalid name format: " + message);
    }
}
