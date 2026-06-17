package Arrays;

public class AverageOfArrayElements {

    public static void main(String[] args) {

        int []arr = {12,13,43};

        int sum = 0;
        float average;

        for (int num : arr){
            sum += num;
        }

        average = (float) sum/arr.length;

        System.out.println( "Average of array is : "+average);
    }
}
