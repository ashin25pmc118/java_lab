import java.util.Scanner;

class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
}

public class StaticTemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        System.out.printf("Fahrenheit = %.1f\n", fahrenheit);

        scanner.close();
    }
}
