import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N = ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element = " + max);

        scanner.close();
    }
}
