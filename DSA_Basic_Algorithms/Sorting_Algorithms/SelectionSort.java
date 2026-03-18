package DSA_Basic_Algorithms.Sorting_Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,1};
        for (int i=0;i< arr.length;i++){
            int minimumIndex = i;

            for (int j=i+1;j< arr.length;j++) {
                if (arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
            }
        System.out.println(Arrays.toString(arr));
    }
}
