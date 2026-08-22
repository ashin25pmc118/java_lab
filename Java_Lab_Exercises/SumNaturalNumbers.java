import java.util.Scanner;

public class SumNaturalNumbers {
    public static int sumNatural(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Sum = " + sumNatural(n));

        scanner.close();
    }
}
