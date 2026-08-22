import java.util.Scanner;

class Box {
    double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }
}

class BoxComparer {
    public void displayLarger(Box b1, Box b2) {
        double v1 = b1.getVolume();
        double v2 = b2.getVolume();
        double larger = (v1 > v2) ? v1 : v2;

        if (larger == (long) larger) {
            System.out.println("Larger Box Volume = " + (long) larger);
        } else {
            System.out.println("Larger Box Volume = " + larger);
        }
    }
}

public class BoxComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Box1 (width height depth): ");
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
        double d1 = scanner.nextDouble();

        System.out.println("Box2 (width height depth): ");
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();
        double d2 = scanner.nextDouble();

        Box box1 = new Box(w1, h1, d1);
        Box box2 = new Box(w2, h2, d2);

        BoxComparer comparer = new BoxComparer();
        comparer.displayLarger(box1, box2);

        scanner.close();
    }
}
