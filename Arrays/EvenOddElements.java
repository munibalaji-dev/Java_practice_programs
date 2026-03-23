package Arrays;

//You are given T(number of test cases) integer arrays.
// For each array A, you have to find the value of absolute difference between the counts of even and odd elements in the array.

import java.util.Scanner;

public class EvenOddElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Test Cases :");
        int T = sc.nextInt();

        while (T -- > 0) {
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element at " + i + "th Index :");
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;


            for (int nums : arr)
                if (nums % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            System.out.println("Absolute Difference = " + Math.abs(evenCount - oddCount));
        }
        sc.close();
    }
}
