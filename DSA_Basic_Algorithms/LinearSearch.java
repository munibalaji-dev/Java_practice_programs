package DSA_Basic_Algorithms;
// Linear Search is the simplest searching algorithm.
// It checks each element in a list one by one until the target element is found or the list ends.

public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,25,30,40,45};
        int target = 30;

        int result = linearSearch(arr,target);
        if(result != -1){
            System.out.println("Element found at index : "+result);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
