package DSA.Arrays;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int []arr = {1,2,2,3,4,3,3,4};
        int temp = arr[arr.length-1];
        for (int i= arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0] = temp;
        System.out.println("After Right Rotating an Array : "+ Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
