package Arrays;

import java.util.Arrays;
public class RotateArrayLeftDplaces {

        //Brute Force : Because we create temp[] so it takes more space
//        int[] arr = {1,2,3,4,5,6,7,8};
//        int[] temp = new int[3];
//
//        int D = 3;
//
//        for (int i=0;i<D;i++){
//            temp[i] = arr[i];
//        }
//        for (int i = D;i< arr.length;i++){
//            arr[i-D] = arr[i];
//        }
//        for (int i=0;i< temp.length;i++){
//            arr[arr.length-D+i] = temp[i];
//        }
//        System.out.println(Arrays.toString(arr));



    static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr,int D){
        int n = arr.length;
        D = D%n;

        reverse(arr,0,D-1);
        reverse(arr,D,n-1);
        reverse(arr,0,n-1);
    }

        // Optimized version
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8};
            int D =3;

            leftRotate(arr,D);

            System.out.println("Array after left rotation by " + D + " places: ");
            System.out.println(Arrays.toString(arr));
        }
}
