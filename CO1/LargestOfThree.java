import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.print("C = ");
        int c = scanner.nextInt();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest = " + largest);

        scanner.close();
    }
}
