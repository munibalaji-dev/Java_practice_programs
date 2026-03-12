package DSA.Arrays;

public class LinearSearch {

    public static void main(String[] args) {


        int[] arr = {1,2,3,5,4,5};
        int num = 4;

        for (int i=0;i< arr.length;i++){
            if (arr[i] ==num){
                System.out.println(arr[i]);
            }
        }
    }
}
