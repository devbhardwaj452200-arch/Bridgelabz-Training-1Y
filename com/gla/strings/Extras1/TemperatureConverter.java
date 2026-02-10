package Extras1;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println(temp + "°C = " + fahrenheit + "°F");
        } else if (choice == 2) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println(temp + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        sc.close();
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
