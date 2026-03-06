package Arrays;

import java.util.Arrays;

public class SortAndMergeArray {

    public static void main(String[] args) {


//        int[] arr1 = {1, 4, 6, 7};
//        int[] arr2 = {0, 3, 5, 8, 9};
//        int[] mergedArray = new int[arr1.length+arr2.length];
        int[] arr1 = {10,20,40,30,60};
        int[] arr2 = {5,8,50,35,38};
        int[] mergedArray = new int[arr1.length+arr2.length];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;     // pointer for arr1
        int j = 0;     // pointer for arr2
        int k = 0;     // pointer for mergedArray

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        // // Step 2: Copy remaining elements of arr1 (if any)
            while (i<arr1.length){
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }
            // // Step 3: Copy remaining elements of arr2 (if any)
            while (j<arr2.length){
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }


        System.out.println(Arrays.toString(mergedArray));
    }
}
