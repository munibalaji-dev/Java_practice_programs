package Strings;

public class MaximumSubArraySum {
    public static int maxsubArray(int[] arr,int k){
        int windowSum=0;
        int maxSum=0;
        int i;
        for (i=0;i<arr.length;i++){
            windowSum+=arr[i];
            if(i>=k-1){
                if (windowSum>maxSum){
                    maxSum=windowSum;
                }
                windowSum-=arr[i-(k-1)];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k=3;
        System.out.println(maxsubArray(arr,k));
    }
}
