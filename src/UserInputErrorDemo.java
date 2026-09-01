import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputErrorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Input - Birth Year
        try {
            System.out.print("Enter your birth year: ");
            int birthYear = sc.nextInt();

            int currentYear = LocalDate.now().getYear();
            int age = currentYear - birthYear;

            System.out.println("Your age is: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid birth year.");
            sc.nextLine();
        }

        // Second Input - Another Birth Year
        try {
            System.out.print("Enter another birth year: ");
            int birthYear2 = sc.nextInt();

            int currentYear = LocalDate.now().getYear();
            int age2 = currentYear - birthYear2;

            System.out.println("Second person's age is: " + age2);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid birth year.");
            sc.nextLine();
        }

        sc.close();
    }
}