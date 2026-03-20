package _Looping_Statements_;

import java.util.Scanner;

public class DiamondShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print diamond shape pattern : ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n - 1; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }
    }
}

