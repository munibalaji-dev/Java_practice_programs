package _Looping_Statements_;

import java.util.Scanner;

public class DiamondShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print diamond shape pattern : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = n - 1; k >= 1; k--) { // Initialization checks once n-1 after that it is not happens
            for (int l = 1; l <= n - k; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= k; m++) {
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }
    }
}

