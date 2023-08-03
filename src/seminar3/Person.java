package seminar3;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String dateOfBirth;
    private final String phone;
    private final String sex;


    public Person(String lastName, String firstName, String middleName, String dateOfBirth, String phone, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.sex = sex;
    }


    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", this.lastName, this.firstName, this.middleName, this.dateOfBirth, this.phone, this.sex);
    }

}
