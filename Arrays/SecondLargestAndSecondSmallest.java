package Arrays;

public class SecondLargestAndSecondSmallest {

    public static void main(String[] args) {

        int [] arr = {11,33,43,4,23,25,43,32,2};
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for (int i=0 ;i< arr.length;i++){
            if (arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>sLargest && arr[i] != largest){ //It prevents duplicates of largest element from overwriting sLargest.
                sLargest = arr[i];
            }


            // Smallest And Second Smallest
            if (arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i]> sSmallest && arr[i] != smallest){  //It prevents duplicates of smallest element from overwriting sSmallest.
                sSmallest = arr[i];
            }
        }
        System.out.println("LARGEST ELEMENT IS : "+largest+"\n");
        System.out.println("SECOND SMALLEST IS : "+sSmallest);
        System.out.println("SECOND LARGEST IS : "+sLargest+"\n");
        System.out.println("SMALLEST ELEMENT IS : "+smallest+"\n");

    }
}
