package _Basics_;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number to check armstrong : ");
            int n = sc.nextInt();
            int dup = n;
            int sum = 0;

            while (n > 0) {
                int lastDigit = n % 10;
                sum = sum + (lastDigit * lastDigit * lastDigit);
                n = n / 10;
            }
            if (sum == dup) {
                System.out.println(dup + "  is ArmStrong Number ");
            } else {
                System.out.println(dup + " is not ArmStrong Number ");
            }
        }
    }
}
