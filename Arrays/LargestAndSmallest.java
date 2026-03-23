package Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,25,3,54};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT IN ARRAY IS : "+max);
        System.out.println("MINIMUM ELEMENT IN ARRAY IS : "+min);

    }
}
