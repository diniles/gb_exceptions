package seminar3.exceptions;

public class IllegalBirthException extends IllegalFieldException {
    public IllegalBirthException(String message) {
        super("Invalid birth date format: " + message + ", correct format: dd.mm.yyyy");
    }
}
