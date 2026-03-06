package _ControlFlow_;

import java.util.Scanner;

public class Primes {

    static boolean printPrimes(int num) {

            if (num < 1) return false;
            if (num==2)return true;
            if (num % 2 == 0) return false;

//            for (int j = 3; j <= Math.sqrt(num); j += 2) {
        for (int j=3;j*j<=num;j+=2)
                if (num % j == 0) {
                    return false;
                }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number up to which you want prime numbers:\"");
        int n = sc.nextInt();


        for (int i = 2;  i <= n; i++) {
            if (printPrimes(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
