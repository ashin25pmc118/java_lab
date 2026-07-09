import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        double grossSalary = basicSalary + da + hra;

        System.out.println("DA = " + (long) da);
        System.out.println("HRA = " + (long) hra);
        System.out.println("Gross Salary = " + (long) grossSalary);

        scanner.close();
    }
}
