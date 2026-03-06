package _Scalar_DSA_.Arrays;

import java.util.Arrays;

public class RemoveDupFromSort {  //Removing Duplicates from sorted array


    public static int remDup(int[] arr) {


        int rd = 0;   // index of last unique element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[rd]) {  // found a new unique value

                rd++;

                arr[rd] = arr[i];  // move it to the next position
            }
        }
        return rd+1;   // length of unique elements
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 3, 3};

        System.out.println("Before Removing : " + Arrays.toString(arr)+"\n");

        int newLength = remDup(arr);

        System.out.print("After Remove Dup From Sorted Array : ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}