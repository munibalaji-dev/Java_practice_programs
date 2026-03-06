package _Looping_Statements_;

import java.util.Scanner;

public class CenterAlignedPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Center Aligned Pattern : ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for (int star=1;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
