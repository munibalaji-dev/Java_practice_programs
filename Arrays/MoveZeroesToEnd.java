package Arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args){
        int[] arr = {1,0,2,3,0,0,4,0,5};

        // Brute Force Approach O(n2)
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] != 0){
//                System.out.print(arr[i]+",");
//            }
//        }
//        for (int j = 0; j < arr.length; j++){
//            if (arr[j] == 0){
//                System.out.print(arr[j]+",");
//            }
//        }

        // Optimized to O(n) from O(n2) using two pointer approach
        int j = 0;
        for(int i = 0; i< arr.length; i++){

            if (arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
