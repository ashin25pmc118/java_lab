import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array:");
        String line = scanner.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("Array cannot be empty.");
            scanner.close();
            return;
        }

        String[] tokens = line.split("\\s+");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.print("Search: ");
        int target = scanner.nextInt();

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position " + position);
        } else {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
