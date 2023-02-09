package lesson7;

import java.util.Scanner;

public class BaseConverter {
    public double convert(double celsius) {
        double fahrenheit = ((celsius * (9 / 5.0)) + 32);
        double kelvin = celsius + 273.15;
        double rankine = (celsius + 273.15) * (9 / 5.0);
        double delisle = (100 - celsius) * (3 / 2.0);
        double newton = celsius * (33 / 100.0);
        double reamur = celsius * (4 / 5.0);
        double romer = celsius * (21 / 40.0) + 7.5;

        System.out.println("Celsius to Fahrenheit: " + fahrenheit);
        System.out.println("Celsius to Kelvin: " + kelvin);
        System.out.println("Celsius to Rankine: " + rankine);
        System.out.println("Celsius to Delisle: " + delisle);
        System.out.println("Celsius to Newton: " + newton);
        System.out.println("Celsius to Reamur: " + reamur);
        System.out.println("Celsius to Romer: " + romer);
        return fahrenheit;
    }

   public static void main(String[] args) {

        System.out.println("Enter temperature in *C:");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        BaseConverter baseConverter = new BaseConverter();
        baseConverter.convert(celsius);

    }
}



