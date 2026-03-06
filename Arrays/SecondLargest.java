package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {11,1,2,3,2,2,3,2,2,22};
        int large = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>large){
                sLarge = large;
                large = arr[i];
            }
            else if (arr[i]>sLarge&&arr[i]!=large){  //It prevents duplicates of largest element from overwriting sLargest.
                sLarge = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(sLarge);
    }
}
