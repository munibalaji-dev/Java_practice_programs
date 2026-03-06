package _Scalar_DSA_.Arrays;

public class SecondSmallest {

    public static void main(String[] args) {

        int[] arr = {7,5,8,9,4,10,5,11,5,13,12};
        int max = arr[0];
        int smax = arr[0];

        for (int i=0;i< arr.length;i++){

            if (arr[i]>max){

//                smax=max;
                max = arr[i];
            }
            else if (smax<arr[i]){
                smax = arr[i];
            }
        }
        System.out.println("Maximum Element is : "+max);
        System.out.println("Second Maximum Element is :"+smax);
    }
}
