import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number = ");
        long number = scanner.nextLong();

        long temp = Math.abs(number);
        long sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        scanner.close();
    }
}
