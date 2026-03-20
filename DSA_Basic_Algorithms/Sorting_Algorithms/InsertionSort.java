package DSA_Basic_Algorithms.Sorting_Algorithms;

import java.util.Arrays;
// I Assumed first element was already sorted, and took the next element, insert into correct position in sorted part
public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5, 3, 8, 4, 2};

        for (int i=1;i<arr.length;i++) {
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
//        for (int num : arr){
//            System.out.print(num+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
