package _ControlFlow_;


//   The Fibonacci series is a sequence of numbers where each number is the sum of the two numbers before it. It starts with 0 and 1.
//📐 Formula: F(n)=F(n−1)+F(n−2)

import java.util.Scanner;
public class FibonacciUpToNTerms {

    static int fibonacci(int n){

        if (n==0)return 0;
        if (n==1)return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i=1;i<n;i++){
            System.out.print(fibonacci(i) + " ");

        }
    }
}
