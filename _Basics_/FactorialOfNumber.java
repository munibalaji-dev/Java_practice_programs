package _ControlFlow_;

//   The factorial of a number n (written as n!) is the product of all positive integers from 1 up to n.
//   FORMULA : n!=n×(n−1)×(n−2)×...×2×1

import java.util.Scanner;

public class FactorialOfNumber {
//    public static void main(String[] args) {
//        int factorial =1;
//        Scanner scn= new Scanner(System.in);
//        System.out.println("Enter A Number To Find Factorial : ");
//        int n = scn.nextInt();
//
//        for (int i=1;i<=n;i++){  //n!=n×(n−1)!
//            factorial *= i;
//        }
//        System.out.println("Factorial of a number is :"+factorial);


            // Recursive function
            static int factorial(int n) {
                if (n == 0 || n == 1) {
                    return 1;   // base case
                } else {
                    return n * factorial(n-1); // recursive call
                }
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                System.out.println("Factorial of " + n + " is: " + factorial(n));
            }
        }


//    }
//}
