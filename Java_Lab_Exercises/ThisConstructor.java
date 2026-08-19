import java.util.Scanner;

class StudentChaining {
    private String name;
    private int age;

    public StudentChaining() {
        System.out.println("Default Constructor");
    }

    public StudentChaining(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Name : " + this.name + " Age : " + this.age);
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        StudentChaining sc = new StudentChaining(name, age);

        scanner.close();
    }
}
