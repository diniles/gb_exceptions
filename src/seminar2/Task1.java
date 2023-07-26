package seminar2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float input = inputFloat();
        System.out.printf("You entered: %f", input);
    }

    static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter float number");
                return Float.parseFloat((scanner.next()));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a float number");
            }
        }
    }
}
