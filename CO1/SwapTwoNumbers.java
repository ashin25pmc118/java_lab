import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        scanner.close();
    }
}
