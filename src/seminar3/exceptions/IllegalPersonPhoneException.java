package seminar3.exceptions;

public class IllegalPersonPhoneException extends RuntimeException {
    public IllegalPersonPhoneException(String message) {
        super("Invalid phone format: " + message + ", correct format: 7 digits");
    }
}
