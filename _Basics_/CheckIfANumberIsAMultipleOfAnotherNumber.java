package _Basics_;

import java.util.Scanner;

public class CheckIfANumberIsAMultipleOfAnotherNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Num 1 value : ");
//        int num1 = sc.nextInt();
//
//        System.out.println("Enter Num 2 value : ");
//        int num2 = sc.nextInt();
//
//        if(num2==0)throw new RuntimeException("Invalid input: division by zero is not allowed.");
//
//        if (num1%num2==0)
//            System.out.println("Num 1 is a  Multiple of num2 ");
//
//        else
//            System.out.println("Num 2 is not multiple by num1");
//        sc.close();
//    }
//}


        try {
            // Take input from the user
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // Check if the second number is zero
            if (num2 == 0) {
                throw new RuntimeException("Cannot check multiple: divisor (second number) cannot be zero.");
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