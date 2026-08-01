import java.util.Scanner;

public class ErrorCorrection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        int count = 3;

        if (count == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double average = (num1 + num2 + num3) / count;
            System.out.println("Average = " + average);
        }

        scanner.close();
    }
}
