import java.util.Scanner;

class CircleResult {
    double radius;
    double area;

    public CircleResult(double radius, double area) {
        this.radius = radius;
        this.area = area;
    }

    public void display() {
        System.out.printf("Radius = %.1f Area = %.2f\n", radius, area);
    }
}

class GeometryCalculator {
    public CircleResult computeCircle(double radius) {
        double area = Math.PI * radius * radius;
        return new CircleResult(radius, area);
    }
}

public class ReturnCircleObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius: ");
        double radius = scanner.nextDouble();

        GeometryCalculator calculator = new GeometryCalculator();
        CircleResult circle = calculator.computeCircle(radius);

        circle.display();

        scanner.close();
    }
}
