import java.util.Scanner;

class OverloadDisplay {
    public void display(int value) {
        System.out.println("Integer : " + value);
    }

    public void display(double value) {
        System.out.println("Double : " + value);
    }

    public void display(String value) {
        System.out.println("String : " + value);
    }
}

public class MethodOverloadDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Integer: ");
        int intVal = scanner.nextInt();

        System.out.print("Double: ");
        double doubleVal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("String: ");
        String strVal = scanner.nextLine();

        OverloadDisplay printer = new OverloadDisplay();
        printer.display(intVal);
        printer.display(doubleVal);
        printer.display(strVal);

        scanner.close();
    }
}
