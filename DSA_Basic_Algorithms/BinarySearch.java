package DSA_Basic_Algorithms;
// Binary Search is a searching algorithm used to find an element in a sorted array.
//It works by dividing the array into two halves repeatedly.
//Instead of checking every element like Linear Search, it checks the middle element first.

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int low =0, high = arr.length-1;

        while (low <= high){

            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            } else if (target > arr[mid]) {
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int target = 50;

        int result = binarySearch(arr,target);
        if(result != -1){
            System.out.println("Element found at index : "+result);
        }else {
            System.out.println("Element not found");
        }
    }
}
