package Arrays;
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {1};
        int[] nums2 = {3, 2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length+ nums2.length];

//        for (int i = 0; i < nums1.length; i++){
//            mergedArray[i] = nums1[i];
//        }
//        for (int j = 0; j < nums2.length; j++){
//            mergedArray[nums1.length+j] = nums2[j];
//        }
//
//        Arrays.sort(mergedArray);

            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            int k = 0;
             while(i < nums1.length && j < nums2.length){
                 if (nums1[i] <= nums2[j]){
                     mergedArray[k] = nums1[i];
                     i++;
                 }else {
                     mergedArray[k] = nums2[j];
                     j++;
                 }
                 k++;
             }
             while(i < nums1.length){
                 mergedArray[k] = nums1[i];
                 i++;
                 k++;
             }
             while(j < nums2.length){
                 mergedArray[k] = nums2[j];
                 j++;
                 k++;
             }

        int n = mergedArray.length;
        double median;

        if (n % 2 == 0){
            median = (mergedArray[n/2 - 1] + mergedArray[n/2]) / 2.0;
        }else {
            median = mergedArray[n/2];
        }

        return median;
    }
}
