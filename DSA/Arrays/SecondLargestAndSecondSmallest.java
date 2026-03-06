package DSA.Arrays;

public class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {

        int[] arr = {2,4,2,3,2,4,3};
        int largest = arr[0];
        int secondLargest = -1;

        for (int i=1;i< arr.length;i++){
            if (arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The Largest Element is : "+largest);
        System.out.println("Second Largest Element is : " +secondLargest);


        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i=1;i<arr.length; i++){
            if (arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i]<secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("The Smallest Element is : "+smallest);
        System.out.println("The Second Smallest Element is : "+secondSmallest);
    }

}
