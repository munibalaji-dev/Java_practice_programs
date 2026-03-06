package _Looping_Statements_;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print number pyramid : ");
        int a = sc.nextInt();

        //int n = 5;  It is also valid but to take input from user is a good practice


        // Outer loop for Rows
        for (int i=1;i<a;i++)
        {
            // Inner Loop for printing numbers from 1 to n
            // for each row of i print numbers from 1 to i
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();

        }
        sc.close();
    }
}