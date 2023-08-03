package seminar3.exceptions;

public class IllegalPersonBirthException extends RuntimeException {
    public IllegalPersonBirthException(String message) {
        super("Invalid birth date format: " + message + ", correct format: dd.mm.yyyy");
    }
}
