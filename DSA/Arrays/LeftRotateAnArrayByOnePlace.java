package DSA.Arrays;

import java.util.Arrays;

public class LeftRotateAnArrayByOnePlace {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int temp;
        temp = arr[0];

        for (int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.println("After Left Rotate An Array By One Place : "+ Arrays.toString(arr));
    }
}
