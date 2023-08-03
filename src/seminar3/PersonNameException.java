package seminar3;

public class PersonNameException extends RuntimeException {
    public PersonNameException(String message) {
        super("Invalid name format: " + message);
    }
}
