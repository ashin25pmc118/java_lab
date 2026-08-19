import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        int length = scanner.nextInt();

        System.out.print("Breadth: ");
        int breadth = scanner.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(length, breadth);

        System.out.println("Rectangle 1 Area = " + r1.getArea() + " Rectangle 2 Area = " + r2.getArea());

        scanner.close();
    }
}
