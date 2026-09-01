class Addition {
    int add(int a, int b) {
        return a + b;
    }
}

class Multiplication {
    int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Addition a = new Addition();
        Multiplication m = new Multiplication();

        System.out.println("Sum = " + a.add(10, 20));
        System.out.println("Product = " + m.multiply(10, 20));
    }
}