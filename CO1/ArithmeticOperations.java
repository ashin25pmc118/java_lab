import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
            System.out.println("Modulus = " + (a % b));
        } else {
            System.out.println("Division and Modulus by zero are undefined.");
        }

        scanner.close();
    }
}
