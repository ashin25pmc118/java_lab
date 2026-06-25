import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (A): ");
        int A = sc.nextInt();

        System.out.print("Enter second number (B): ");
        int B = sc.nextInt();

        System.out.print("Enter third number (C): ");
        int C = sc.nextInt();

        int largest;

        if (A >= B && A >= C) {
            largest = A;
        } else if (B >= A && B >= C) {
            largest = B;
        } else {
            largest = C;
        }

        System.out.println("Largest = " + largest);

        sc.close();
    }
}