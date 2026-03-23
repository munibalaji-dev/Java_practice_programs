package _Basics_;

import java.util.Scanner;

public class MultiplicationOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Multiplication Table of "+n);
        for (int i=1;i<=10;i++){
            int product = n*i;
            System.out.println(n+" X "+i+" = "+product);
        }
    }
}
