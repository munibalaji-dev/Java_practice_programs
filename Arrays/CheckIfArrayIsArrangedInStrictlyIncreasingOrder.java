package Arrays;

//Given an array A[].Write a function which return true if array is arranged in a strictly increasing order otherwise return false

import java.util.Scanner;

public class CheckIfArrayIsArrangedInStrictlyIncreasingOrder {

    public static boolean isIncreasing(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {         //Checking the previous element is bigger or not
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of an Array :");

//        int T = sc.nextInt();
//        for (int t = 1; t <= T; t++) {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Array Element : ");
            arr[i] = sc.nextInt();
        }
        boolean isInc = isIncreasing(arr);
        if (isInc == true) {
            System.out.println("Array is in increasing order ");
        } else {
            System.out.println("Array is in decreasing order ");
        }


//        int[] arr ={1,2,4,2,3,3,3,4,4,1,3,2};
//        System.out.println(isIncreasing(arr));
    }
}

