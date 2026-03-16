package DSA_Basic_Algorithms;

// Using Kaden's Algorithm
public class FindMaximumSubArraySum {

    static int maxSubarray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for (int i=0;i<arr.length;i++){
            currentSum += arr[i];

            if (currentSum>maxSum){
                maxSum = currentSum;
            }
            if (currentSum<0){
                currentSum = 0;
            }
        }


        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = 7;

        System.out.println(maxSubarray(arr));
    }
}
