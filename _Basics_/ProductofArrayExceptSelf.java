package _Basics_;
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.


import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums){

        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];


        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++){
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }
    public static void main(String[] args) {

        // Brute Force O(n²)
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
        
//        for (int i = 0; i < nums.length; i++){
//            int product = 1;
//            for (int j = 0; j < nums.length; j++){
//                if (nums[i] != nums[j]){
//                    product *= nums[j];
//                }
//            }
//            System.out.print(product);
//        }
    }
}
