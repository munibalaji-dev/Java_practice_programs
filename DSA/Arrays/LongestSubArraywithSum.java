package DSA.Arrays;

public class LongestSubArraywithSum {

    static int subArray(int[] arr, int k){
        int left = 0, right = 0, sum =0, maxLength = 0;
        int n = arr.length;
        sum = arr[0];

        while(right<n){
            while (left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if (sum == k){
                maxLength = Math.max(maxLength, right-left+1);
            }
            right++;
            if (right<n){
                sum += arr[right];
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        int k = 6;

        System.out.println(subArray(arr, k));
    }
}
