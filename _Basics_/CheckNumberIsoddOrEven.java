package _Basics_;

import java.util.Scanner;

public class CheckNumberIsoddOrEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check Even Or Odd : ");
        int num = sc.nextInt();

        if (num%2==0)
            System.out.println("You Entered " +num+ " is Even Number ");
        else
            System.out.println("You Entered " +num+ " is Odd Number");

        sc.close();
    }
}
