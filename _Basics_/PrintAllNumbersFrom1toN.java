package _ControlFlow_;

import java.util.Scanner;
public class PrintAllNumbersFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Value : ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("N Numbers are : "+i);
        }
    }
}
