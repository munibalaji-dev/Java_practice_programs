package Arrays;

public class AverageElement {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int sum = 0;
        float average;

        for (int num : arr){
            sum += num;
        }
        average = (float) sum/arr.length;
        System.out.println("AVERAGE OF ELEMENTS : "+average);
    }
}
