package _Looping_Statements_;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {

//        int n=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print how many rows you want : ");
        int n = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
            sc.close();
        }
    }
    }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number how many rows you want to print : ");
//        int n = sc.nextInt();
//
//        char ch = 'A';
//
//        for(int i=0;i<=n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print(ch +" ");
//            }
//            System.out.println();
//            ch++;
//            sc.close();
//
//        }
//    }
//}
