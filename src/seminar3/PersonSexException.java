package seminar3;

public class PersonSexException extends RuntimeException {
    public PersonSexException(String message) {
        super("Invalid sex format: " + message + ", correct format: 'm' or 'f'");
    }
}
