package _Basics_;

import java.util.Scanner;

public class FindNumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Find Whether The Number Is Positive,Negative Or Zero : ");
        int num = sc.nextInt();
//
//        if(num > 0)
//            System.out.println("Positive Number : " +num);
//
//        else if (num < 0)
//            System.out.println("Negative Number : " +num);
//
//        else
//            System.out.println("You Entered Zero");
//
//        sc.close();

        // Without if using ternary operator
        String result = (num > 0) ? "positive"
                     :(num < 0) ? "negative"
                     :"Zero";

        System.out.println(result);

    }
}
