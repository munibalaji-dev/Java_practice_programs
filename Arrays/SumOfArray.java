package _Scalar_DSA_.Arrays;

import java.util.Scanner;
//Write a program to print sum of elements of the input array A of size N.
public class SumOfArray {

    public static void main(String[] args) {


//        Take from user
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for (int i=0;i< arr.length;i++){
//            sum += arr[i];
//        }
//        System.out.println("Sum Of An Array is : "+sum);


//      Provided already
//        int[] arr ={1,2,3,4,5};
//        int sum = 0;
//
//        for (int i = 0;i< arr.length;i++){
////            sum += arr[i];
//            sum = sum+(arr[i]);
//        }
//        System.out.println("The sum of an array is : "+sum);


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;

        for (int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}