package seminar2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            String userInput = readInput();
            System.out.println("You entered: " + userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Empty strings are not allowed.");
        }
        return input;
    }
}


