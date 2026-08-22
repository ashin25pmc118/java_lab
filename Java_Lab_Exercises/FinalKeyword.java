import java.util.Scanner;

public class FinalKeyword {
    public static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;

        System.out.printf("Area = %.2f\n", area);

        scanner.close();
    }
}
