package Arrays;

public class LargestAndSecondLargest {
    public static void main(String[] args) {

        int[] arr = {10,20,41,40,50};

        if (arr.length<2){
            System.out.println("SecondLargest does not exist");
        }
//        int largest = arr[0];
//        int secondLargest = arr[0];

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest=arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Value : "+largest);
        System.out.println("SecondLargest Value :"+secondLargest);
    }
}
