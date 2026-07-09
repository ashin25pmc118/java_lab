import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Time: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double totalAmount = principal + simpleInterest;

        if (simpleInterest == (long) simpleInterest) {
            System.out.println("Simple Interest = " + (long) simpleInterest);
        } else {
            System.out.println("Simple Interest = " + simpleInterest);
        }

        if (totalAmount == (long) totalAmount) {
            System.out.println("Amount = " + (long) totalAmount);
        } else {
            System.out.println("Amount = " + totalAmount);
        }

        scanner.close();
    }
}
