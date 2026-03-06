package _Scalar_DSA_.Arrays;

import java.util.Scanner;
//You are given an integer T (number of test cases). You are given array A and an integer B for each test case.
// You have to tell whether B is present in array A or not.

public class SearchAnElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter T (number of test cases) : ");
        int T = sc.nextInt();
        while (T-->0) {
            System.out.println("Enter The Size Of An Array : ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter Element at "+i+"th Index : ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter B Value : ");
            int B = sc.nextInt();
//            int found = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == B) {
                    System.out.println("B element is present in array : "+B );
                    break;
                }
            }
//            System.out.println(found);
        }
    }
}
