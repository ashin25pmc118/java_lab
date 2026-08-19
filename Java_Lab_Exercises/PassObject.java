import java.util.Scanner;

class StudentInfo {
    String name;
    int rollNo;

    public StudentInfo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class StudentPrinter {
    public void printDetails(StudentInfo s) {
        System.out.println("Student Name : " + s.name + " Roll No : " + s.rollNo);
    }
}

public class PassObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();

        StudentInfo student = new StudentInfo(name, rollNo);
        StudentPrinter printer = new StudentPrinter();

        printer.printDetails(student);

        scanner.close();
    }
}
