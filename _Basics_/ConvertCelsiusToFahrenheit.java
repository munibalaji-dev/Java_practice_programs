package _Basics_;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit
{
        public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number : ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius*9/5)+32;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        sc.close();
    }
}
