import java.util.Scanner;

class ShapeArea {
    public int area(int side) {
        return side * side;
    }

    public int area(int length, int breadth) {
        return length * breadth;
    }
}

public class MethodOverloadArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Side: ");
        int side = scanner.nextInt();

        System.out.print("Length: ");
        int length = scanner.nextInt();

        System.out.print("Breadth: ");
        int breadth = scanner.nextInt();

        ShapeArea calculator = new ShapeArea();
        int squareArea = calculator.area(side);
        int rectArea = calculator.area(length, breadth);

        System.out.println("Area of Square = " + squareArea + " Area of Rectangle = " + rectArea);

        scanner.close();
    }
}
