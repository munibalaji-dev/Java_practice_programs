package Arrays;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,32,23,4,4,3,54,0,-1,-2};
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < small){
                sSmall = small;
                small = arr[i];
            } else if (arr[i] > sSmall && arr[i] != small) {
                sSmall = arr[i];

            }
        }
        System.out.println(small);
        System.out.println(sSmall);
    }
}
