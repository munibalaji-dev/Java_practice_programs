package DSA_Basic_Algorithms;

//Find if two numbers in a sorted array give a target sum.

public class TwoPointerTechnique {

    private static boolean findPair(int[] arr, int target) {
        int left = 0, right = arr.length-1;

        while (left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return true;
            } else if (sum<target) {
                left++;
            }
            else{
                right++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;

        System.out.println(findPair(arr, target));
    }
}
