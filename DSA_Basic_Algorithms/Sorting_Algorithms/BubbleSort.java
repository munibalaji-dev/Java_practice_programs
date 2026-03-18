package DSA_Basic_Algorithms.Sorting_Algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr ={3,2,5,4,1};
        int n = arr.length;
        boolean swapped;
        for (int i=0;i<n-1;i++){
            swapped = false;
            for (int j =0;j<n-i-1;j++){   // why I write the condition like j<arr.length - i; Assume i is at position 2 which means 2 elements already sorted and also 2 elements already go to end.
                                            // so, we reduce the innerloop dont go to through the end so i use -i; Slightly optimized here.
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true  ;
                }
            }
            if (!swapped) {
                System.out.println("Array is already in sorted order");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
