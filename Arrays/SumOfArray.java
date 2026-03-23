package Arrays;

import java.util.Scanner;
//Write a program to print sum of elements of the input array A of size N.
public class SumOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element at index : "+i);
            arr[i] = sc.nextInt();
        }

        int sum =0;

        for (int num : arr){
            sum += num;
        }

//        for (int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }

        System.out.println(sum);
    }
}