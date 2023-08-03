package seminar3.exceptions;

public class IllegalNameException extends IllegalFieldException {
    public IllegalNameException(String message) {
        super("Invalid name format: " + message);
    }
}
