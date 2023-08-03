package seminar3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class FieldsValidator {
    private static final Pattern namePattern = Pattern.compile("^[a-zA-Z]{2,}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern phonePattern = Pattern.compile("^[0-9]{7,}$");

    public static boolean illegalName(String name) {
        Matcher matcher = namePattern.matcher(name);
        return !matcher.matches();
    }

    public static boolean illegalPhone(String phone) {
        Matcher matcher = phonePattern.matcher(phone);
        return !matcher.matches();
    }

    public static boolean illegalDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            formatter.parse(date);
            return false;
        } catch (DateTimeException e) {
            return true;
        }
    }

    public static boolean illegalSex(String sex) {
        return !(sex.equals("m") || sex.equals("f"));
    }
}
