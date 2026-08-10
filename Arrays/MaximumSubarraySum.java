package Arrays;

//  Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
public class MaximumSubarraySum {

    public static void main(String[] args) {

        int[] nums = {1, -1, 2, 3};
        MaximumSubarraySum max = new MaximumSubarraySum();

        int result = max.subArray(nums);

        System.out.println(result);

    }
    public int subArray(int[] nums){

        // Naive Approach 1
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){

            for (int j = i; j < nums.length; j++){
                int sum = 0;

                for (int k = i; k <= j; k++){

                    sum += nums[k];
                }
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }

        // Better Approach 2
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++){
//            int sum = 0;
//            for (int j = i; j < nums.length; j++){
//                sum += nums[j];
//            }
//            if (sum > maxSum){
//                maxSum = sum;
//            }
//        }

        // Best Approach 3

//        int maxSum = Integer.MIN_VALUE;
//        int currentSum = 0;
//
//        for (int i = 0; i < nums.length; i++){
//            currentSum += nums[i];
//
//            if (currentSum > maxSum){
//                maxSum = currentSum;
//            }
//
//            if (currentSum < 0){
//                currentSum = 0;
//            }
//        }
        return maxSum;
    }
}
