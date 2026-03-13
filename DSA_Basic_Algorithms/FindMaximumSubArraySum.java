package DSA_Basic_Algorithms;

// Using Kaden's Algorithm
public class FindMaximumSubArraySum {

    static int subArraySum(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];

            if (sum>maxSum){
                maxSum = sum;
            }
            if (sum<0){
                sum = 0;
            }
        }


        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = 7;

        System.out.println(subArraySum(arr, n));
    }
}
