class Employee {
    public void calculateSalary() {
        System.out.println("Calculating employee salary...");
    }
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Manager Salary: $8000");
    }
}

class Developer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Developer Salary: $6000");
    }
}

class Intern extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Intern Salary: $2000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp;

        emp = new Manager();
        emp.calculateSalary();

        emp = new Developer();
        emp.calculateSalary();

        emp = new Intern();
        emp.calculateSalary();

    }
}