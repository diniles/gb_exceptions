package seminar3.exceptions;

public class IllegalSexException extends IllegalFieldException {
    public IllegalSexException(String message) {
        super("Invalid sex format: " + message + ", correct format: 'm' or 'f'");
    }
}
