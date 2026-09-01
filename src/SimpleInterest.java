import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        double amount = p + si;

        System.out.println("Simple Interest = " + si);
        System.out.println("Amount = " + amount);

        sc.close();
    }
}