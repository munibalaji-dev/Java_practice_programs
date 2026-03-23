package _Basics_;

import java.util.Scanner;
//The square root of a number is the value which, when multiplied by itself, gives the number.√36 = 6 (because 6 × 6 = 36)Math.sqrt(36)  // returns 6.0
public class PrimeNumberOrNot {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt =0;
//        System.out.println("Enter A Number To check Prime or not : ");
//        int n = sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            if (n%i==0){
//                cnt++;
//            }
//        }
//        if (cnt ==2){
//            System.out.print("Prime Number");
//        }
//        else System.out.println("Not Prime");



    // Without Math.sqrt to find prime number

    static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}


//    using Math.sqrt to find prime or not
//        static boolean isPrime(int n){
//            if (n<1) return false;  // 0 and 1 are not prime
//            if (n==2) return true;  // 2 is prime
//            if (n%2==0) return false;  // even numbers > 2 are not prime
//
//            for (int i =3;i<Math.sqrt(n);i+=2){
//                if (n%i==0)
//                    return false;  // found a divisor, not prime
//            }
//            return true; // no divisors found → prime
//        }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check Whether It Is Prime Or Not : " );
        int n = sc.nextInt();

            if (isPrime(n)) {
                System.out.println(n + " is a Prime number.");
            } else {
                System.out.println(n + " is NOT a Prime number.");
            }
    }
}
