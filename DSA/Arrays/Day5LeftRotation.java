package DSA.Code_With_J;

import java.util.Arrays;

public class Day5LeftRotation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println("After Rotating an Array :"+ Arrays.toString(arr));  // Arrays.toString( It loops through the array, Converts each element to a string Builds a new String object) Internally equivalent to: for (int i = 0; i < arr.length; i++)
        // Preferrable One According to Space
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
