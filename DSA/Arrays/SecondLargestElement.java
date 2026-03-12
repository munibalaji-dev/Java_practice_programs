package DSA.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr = {1,2,3,2,2,3,};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Element is : "+largest);
        System.out.println("Second Largest Element is : "+secondLargest);
    }
}
