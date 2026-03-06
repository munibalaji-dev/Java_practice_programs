package _Looping_Statements_;

import java.util.Scanner;

public class ContinuosNumberCenterAligned {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print Continuos Number Center Aligned Triangle : ");
        int n = sc.nextInt();

        int num =1;
        for (int i=1;i<=n;i++){
            for(int space =1;space<=n-i;space++) {
                System.out.print(" ");
            }
                for(int number = 1;number<=i;number++){
                    System.out.print(num +" ");
                    num++;
                }
            System.out.println();
            }
        sc.close();
        }
    }
