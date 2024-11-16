package Arrays_and_Methods_in_Java;

import java.util.Scanner;

public class ChangeTemperature {

    public static double FahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double CelsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius / (5.0 / 9) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        double fahrenheit, celsius;

        switch (choice) {
            case 1:
                System.out.print("Enter fahrenheit: ");
                fahrenheit = sc.nextDouble();
                System.out.printf("%-20s%s", "Fahrenheit", "Celsius");
                System.out.printf("\n%-20s%s", fahrenheit, FahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.print("Enter celsius: ");
                celsius = sc.nextDouble();
                System.out.printf("%-20s%s", "Celsius", "Fahrenheit");
                System.out.printf("\n%-20s%s", celsius, CelsiusToFahrenheit(celsius));
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
