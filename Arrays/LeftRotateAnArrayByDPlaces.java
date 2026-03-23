package Arrays;

import java.util.Arrays;

public class LeftRotateAnArrayByDPlaces {

    public static void main(String[] args) {


        // Brute Force Approach
//        D = 2
//        int[] n = {1, 2, 3, 4, 5, 6, 7};
//        int temp = n[0];
//        int temp1 = n[1];
//
//        for (int i = 2; i < n.length; i++) {
//            n[i - 2] = n[i];
//        }
//        n[n.length - 2] = temp;
//        n[n.length - 1] = temp1;
//        System.out.println("After Rotating An Array By D Places : "+ Arrays.toString(n));


//        Optimal Approach
        int d = 3;
        int[] arr = {1,2,3,4,5,6,7};
        int[] temp = {1,2,3};

//        Shifting the elements
        for (int i=3;i< arr.length;i++){
            arr[i-d] = arr[i];
        }

//        Pull Back the D places
//        for (int i=arr.length-d;i< arr.length;i++){
        for (int i=5;i< arr.length;i++){
            arr[i] = temp[i-(arr.length-d)];
        }
        System.out.println(Arrays.toString(arr));
    }
}
