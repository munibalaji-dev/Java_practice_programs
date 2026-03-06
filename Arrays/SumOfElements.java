package Arrays;

public class SumOfElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int sum = 0;
        // Using Normal For--Loop
//        for (int i=0;i<arr.length;i++){
//            sum +=arr[i];
//        }
        // Using Enhanced For-Loop
        for (int num : arr){
            sum+=num;
        }
        System.out.println("THE SUM OF ELEMENTS IS : "+sum);
    }
}
