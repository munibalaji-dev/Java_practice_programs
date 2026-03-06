package _Looping_Statements_;

import java.util.Scanner;

public class RightAlignContinuosNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Right Aligned Continuos Number Triangle : ");
        int n = sc.nextInt();

        int num = n*(n+1)/2;

        //int num =1;

        for (int i=1;i<=n;i++) {

            for (int space=1;space<=n-i;space++) {
                System.out.print("  ");
            }
                for (int j=1;j<=i;j++) {
                    System.out.print(" " +num);

                   // num--;
                    num++;
                }
            System.out.println();
            }
        sc.close();
    }
}
