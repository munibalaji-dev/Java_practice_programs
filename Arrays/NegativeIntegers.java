package Arrays;

import java.util.Scanner;

//Write a program to print all negative numbers from input array A of size N.
// Take integer N and N elements of the array as input from user.

public class NegativeIntegers {

    public static void negativeNumbers(int []arr){

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int []arr = new int[n];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter Array Element in : "+i+" Index");
            arr[i] = sc.nextInt();
        }

        negativeNumbers(arr);
    }
}
