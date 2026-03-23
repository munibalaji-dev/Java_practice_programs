package Arrays;

import java.util.Scanner;

//You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
//
//You have to print the odd and even elements of array A in 2 separate lines.
//
//NOTE: Array elements should have the same relative order as in A.

public class SeperateOddEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Test Cases : ");
        int T = sc.nextInt();


        while (T-- > 0) {

            System.out.print("Enter Array Size : ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Element at " + i + "th Index : ");
                arr[i] = sc.nextInt();
            }


            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
//                } else {
//                    System.out.print(arr[i] + " ");
//                }
                }
            }

            System.out.println();

            for (int i = 0; i < n; i++){
                if (arr[i] % 2 != 0){
                    System.out.print(arr[i]+" ");
                }
            }

            System.out.println();
        }
        }
    }
