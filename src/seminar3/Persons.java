package seminar3;

import seminar3.exceptions.IllegalPersonBirthException;
import seminar3.exceptions.IllegalPersonNameException;
import seminar3.exceptions.IllegalPersonPhoneException;
import seminar3.exceptions.IllegalPersonSexException;

public class Persons {
    public static Person createPerson(String line) {
        String[] input = line.split(" ");
        if (input.length != 6) {
            throw new IllegalArgumentException("Invalid line: " + line + ", enter 6 fields separated by space");
        }

        String lastName = input[0];
        String firstName = input[1];
        String middleName = input[2];
        String birthDate = input[3];
        String phoneNumber = input[4];
        String sex = input[5];
        if (FieldsValidator.illegalName(lastName)) {
            throw new IllegalPersonNameException("Last name: " + lastName);
        }
        if (FieldsValidator.illegalName(firstName)) {
            throw new IllegalPersonNameException("First name: " + firstName);
        }
        if (FieldsValidator.illegalName(middleName)) {
            throw new IllegalPersonNameException("Middle name: " + middleName);
        }
        if (FieldsValidator.illegalDate(birthDate)) {
            throw new IllegalPersonBirthException(birthDate);
        }
        if (FieldsValidator.illegalPhone(phoneNumber)) {
            throw new IllegalPersonPhoneException(phoneNumber);
        }
        if (FieldsValidator.illegalSex(sex)) {
            throw new IllegalPersonSexException(sex);
        }

        return new Person(lastName, firstName, middleName, birthDate, phoneNumber, sex);
    }
}
