package _Basics_;

import java.util.Scanner;

public class CheckIfANumberIsAMultipleOfAnotherNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            // Take input from the user
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // Check if the second number is zero
            if (num2 == 0) {
                System.out.println("Second number cannot be zero");
            }
            // Check if num1 is a multiple of num2
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is a multiple of " + num2);
            } else {
                System.out.println(num1 + " is not a multiple of " + num2);
            }

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}