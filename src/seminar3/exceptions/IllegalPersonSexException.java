package seminar3.exceptions;

public class IllegalPersonSexException extends RuntimeException {
    public IllegalPersonSexException(String message) {
        super("Invalid sex format: " + message + ", correct format: 'm' or 'f'");
    }
}
