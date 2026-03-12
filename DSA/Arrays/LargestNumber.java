package DSA.Arrays;

public class LargestNumber {
    public static void main(String[] args) {

        int []arr = {110,2,32,3,42,33,22,45};
//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Number is : "+max);
    }
}
