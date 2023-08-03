package seminar3;

public class PersonBirthException extends RuntimeException {
    public PersonBirthException(String message) {
        super("Invalid birth date format: " + message + ", correct format: dd.mm.yyyy");
    }
}
