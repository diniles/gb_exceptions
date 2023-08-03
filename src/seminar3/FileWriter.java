package seminar3;

import java.io.File;
import java.io.IOException;

public class FileWriter {
    private final Person person;

    public FileWriter(Person person) {
        this.person = person;
    }

    public void writeToFile() {
        File file = new File(this.person.getLastName());
        try (java.io.FileWriter writer = new java.io.FileWriter(file, true)) {
            writer.write(this.person.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
