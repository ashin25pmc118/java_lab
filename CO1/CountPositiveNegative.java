import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array elements on a single line (space-separated):");
        String line = scanner.nextLine().trim();

        if (line.isEmpty()) {
            System.out.println("No input provided.");
            scanner.close();
            return;
        }

        String[] tokens = line.split("\\s+");
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (String token : tokens) {
            int val = Integer.parseInt(token);
            if (val > 0) positiveCount++;
            else if (val < 0) negativeCount++;
            else zeroCount++;
        }

        System.out.println("Positive numbers = " + positiveCount);
        System.out.println("Negative numbers = " + negativeCount);
        System.out.println("Zeros = " + zeroCount);

        scanner.close();
    }
}
