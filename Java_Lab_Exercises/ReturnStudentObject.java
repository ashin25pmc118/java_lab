import java.util.Scanner;

class StudentRecordModel {
    String name;
    int mark;

    public StudentRecordModel(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Student Name : " + name + " Mark : " + mark);
    }
}

class StudentFactory {
    public StudentRecordModel createStudent(String name, int mark) {
        return new StudentRecordModel(name, mark);
    }
}

public class ReturnStudentObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Mark: ");
        int mark = scanner.nextInt();

        StudentFactory factory = new StudentFactory();
        StudentRecordModel student = factory.createStudent(name, mark);

        student.display();

        scanner.close();
    }
}
