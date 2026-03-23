package Arrays;

public class IsSortOrNot {
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        if (n <= 1) return true;

        for (int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,5};
        System.out.println(isSorted(arr));
    }
}
