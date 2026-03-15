package DSA_Basic_Algorithms;

import java.util.Arrays;

public class TwoSum {

    static int[] twoSum(int[] arr, int target){

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,8,9,6};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
