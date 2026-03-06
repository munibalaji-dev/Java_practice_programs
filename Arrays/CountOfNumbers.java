package _Scalar_DSA_.Arrays;

//Given an Array A[] and element K . write a function that returns count of k in A[].

import java.util.Scanner;

public class CountOfNumbers {

    public static int countNum(int[] A,int k){
       int cnt = 0;
        for (int i=0;i<A.length;i++){
            if (A[i] == k){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of An Array : ");
        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i=0;i<A.length;i++){
            System.out.println("Enter A[] Element : ");
            A[i] = sc.nextInt();
        }
        System.out.println("Enter K Element : ");
        int k = sc.nextInt();

        System.out.println("Count of " + k + " in array: " + countNum(A, k));

    }
}
