package _Basics_;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Reverse It : ");
        int n = sc.nextInt();
        int revNum = 0;
        int lastDigit;

        while (n > 0) {
            lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(revNum);
    }
}
