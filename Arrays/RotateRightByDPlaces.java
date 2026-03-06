package Arrays;

import java.util.Arrays;

public class RotateRightByDPlaces {

    // Brute Force :
//        int[] arr = {1,2,3,4,5,6,7,8};
//        int[] temp = new int[3];
//        int D = 3;
//        int n = arr.length;
//
//        for (int i= 0;i < D;i++){
//            temp[i] = arr[n-D+i];
//        }
//        for (int i= n-D-1;i>=0;i--){
//            arr[i+D] = arr[i];
//        }
//        for (int i=0;i< temp.length;i++){
//            arr[0+i] = temp[i];
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//    }


        static void reverse(int[] arr,int start,int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rightRotate(int[] arr,int D){
        int n = arr.length;
        D = D%n;

        reverse(arr,n-D, n-1);
        reverse(arr,0,n-D-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int D = 3;
        int start = 0;
        int end= arr.length-1;

        rightRotate(arr, D);

        System.out.println("Right Rotate Array By " + D + " Places");
        System.out.println(Arrays.toString(arr));
    }
}
