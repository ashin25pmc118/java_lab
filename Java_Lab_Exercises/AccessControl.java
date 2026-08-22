import java.util.Scanner;

class EncapsulatedStudent {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class AccessControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        EncapsulatedStudent student = new EncapsulatedStudent();
        student.setName(name);
        student.setAge(age);

        System.out.println("Student Name : " + student.getName() + " Age : " + student.getAge());

        scanner.close();
    }
}
