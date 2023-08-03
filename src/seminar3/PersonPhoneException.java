package seminar3;

public class PersonPhoneException extends RuntimeException {
    public PersonPhoneException(String message) {
        super("Invalid phone format: " + message + ", correct format: 7 digits");
    }
}
