package _Basics_;

import java.util.Scanner;

public class LargestAndSmallestNumbersBetweenTwoInputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();

        // Find and print largest and smallest

//        These lines use the ternary conditional operator (? :), which is a concise way to write an if-else statement.

        int largest = (a > b) ? a : b;
        int smallest = (a < b) ? a : b;


//        int largest = Math.max(a, b);
//        int smallest = Math.min(a,b);

        System.out.println("Largest Element is : " +largest);
            System.out.println("Smallest Element is : "+smallest);

        sc.close();
    }
}
