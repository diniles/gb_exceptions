package seminar3;

import seminar3.exceptions.IllegalFieldException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"exit\" to exit program");
        while (true) {
            System.out.println("Enter person data like this \"Lastname Fistname Middlename DD.MM.YYY 1234567 m/f\" :");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                Person person = Persons.createPerson(input);
                new FileWriter(person).writeToFile();
            } catch (IllegalFieldException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input format: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong, please try again:" + e.getMessage());
            }
        }
    }
}

