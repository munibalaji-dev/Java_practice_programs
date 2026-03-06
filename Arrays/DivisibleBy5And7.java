package _Scalar_DSA_.Arrays;

//Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.


import java.util.Scanner;
import java.util.ArrayList;

public class DivisibleBy5And7 {
    public static int[] divisibleNumbers(int[] arr){
        int[] arr1 = new int[arr.length];
        int j = 0;
        for (int i=0;i < arr1.length;i++){
            if (arr[i] % 5 ==0 && arr[i] % 7 ==0){
                arr1[j] = arr[i];
                j++;
            }
        }
        int[] arr2 = new int[j];
        for (int i=0;i < j;i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i < n;i++){
            System.out.println("Enter Element at "+i+" th Index :");
            int arr = sc.nextInt();
            list.add(arr);

        }
        // Convert ArrayList to int[]
        int[] inputArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            inputArr[i] = list.get(i);
        }

        // Call function
        int[] result = divisibleNumbers(inputArr);

        // Print result
        if (result.length == 0) {
            System.out.println("No elements divisible by both 5 and 7.");
        } else {
            System.out.println("Elements divisible by both 5 and 7:");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
