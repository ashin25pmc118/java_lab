import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        System.out.print("A = ");
        double a = scanner.nextDouble();

        System.out.print("B = ");
        double b = scanner.nextDouble();

        switch (choice) {
            case 1:
                double sum = a + b;
                System.out.println("Result = " + (sum == (long) sum ? (long) sum : sum));
                break;
            case 2:
                double diff = a - b;
                System.out.println("Result = " + (diff == (long) diff ? (long) diff : diff));
                break;
            case 3:
                double prod = a * b;
                System.out.println("Result = " + (prod == (long) prod ? (long) prod : prod));
                break;
            case 4:
                if (b != 0) {
                    double div = a / b;
                    System.out.println("Result = " + (div == (long) div ? (long) div : div));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}
