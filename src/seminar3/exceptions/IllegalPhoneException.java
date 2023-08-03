package seminar3.exceptions;

public class IllegalPhoneException extends IllegalFieldException {
    public IllegalPhoneException(String message) {
        super("Invalid phone format: " + message + ", correct format: 7 digits");
    }
}
