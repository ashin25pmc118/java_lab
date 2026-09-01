class Employeelll {

    // Private salary cannot be accessed directly outside this class
    private double salary;

    // Constructor
    Employeelll(double salary) {
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class new1 {

    public static void main(String[] args) {

        Employeelll employee = new Employeelll(30000);

        // Get salary using getter
        System.out.println("Salary: Rs." + employee.getSalary());

        // Change salary using setter
        employee.setSalary(35000);

        System.out.println("Updated Salary: Rs."
                + employee.getSalary());
    }
}