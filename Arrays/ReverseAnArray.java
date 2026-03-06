package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        // It Just Print Elements in Reverse
//        int[] arr = {1,2,3,4,5};
//
//        for (int i= arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

//        Even Better (In-place Reverse)


        int []arr = {1,2,3,5,4,6,9,8,7};
        int []rev = new int[arr.length];

        for (int i=0;i<arr.length;i++){
            rev[i] = arr[arr.length-1-i];
        }
        System.out.println("Array In Reverse : "+Arrays.toString(rev));


//If you want to actually reverse the array itself (not just print):
//        int[] arr = {1,2,3,5,4,5};
//        int start = 0;
//        int end = arr.length-1;
//        int temp;
//        while (start<end){
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));

//         It Just Reversing an array not in array type
//        for (int num : arr){
//            System.out.print(num+" ");
//        }

    }
}
