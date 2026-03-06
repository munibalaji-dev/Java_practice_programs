package _Scalar_DSA_.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//You are given a constant array A and an integer B.
//You are required to return another array where outArr[i] = A[i] + B.

public class CopyTheArray {

    public static int[] copyArray(final int[] arr, int B){

        int[] c = new int[arr.length];

        for (int i=0;i< arr.length;i++){
            c[i] = arr[i]+B;
        }
        return c;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Array Element "+i);
            arr[i] = sc.nextInt();
        }
//        int[] c = new int[arr.length];
        int B = 3;

        System.out.println("Copy Array is : "+ Arrays.toString(copyArray(arr,B)));
    }
}
