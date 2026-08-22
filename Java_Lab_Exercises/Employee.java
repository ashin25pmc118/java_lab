import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee Name : " + name + " Employee Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, salary);
        emp.display();

        scanner.close();
    }
}
