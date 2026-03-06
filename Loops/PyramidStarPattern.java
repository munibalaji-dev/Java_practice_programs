package _Looping_Statements_;

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print * Pyramid : ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print("* ");
        }
            System.out.println();
        }
        sc.close();
    }
}
