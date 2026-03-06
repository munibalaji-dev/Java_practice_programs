package _Basics_;

import java.util.Scanner;

public class FindNumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Find Whether The Number Is Positive,Negative Or Zero : ");
        int finding = sc.nextInt();

        if(finding>1)
            System.out.println("Positive Number : " +finding);

        else if (finding<0)
            System.out.println("Negative Number : " +finding);

        else
            System.out.println("You Entered Zero");

        sc.close();

    }
}
