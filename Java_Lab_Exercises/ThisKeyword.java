import java.util.Scanner;

class StudentRecord {
    private String name;
    private int age;

    public StudentRecord(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name : " + this.name + " Age : " + this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        StudentRecord student = new StudentRecord(name, age);
        student.display();

        scanner.close();
    }
}
