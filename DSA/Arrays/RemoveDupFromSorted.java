package DSA.Arrays;

import java.util.Arrays;

public class RemoveDupFromSorted {

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,2,3,3};

        int i = 0;
        for (int j=1;j< arr.length;j++){
            if (arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("After Removing Duplicates From A Sorted Array : "+ Arrays.toString(arr));



//        int arr[] = {1,1,2,2,2,3,3};
//
//        for (int i=1;i< arr.length;i++){
//            if (arr[i]!=arr[i-1]){
//                arr[i+1]
//            }
//        }











    }
}
