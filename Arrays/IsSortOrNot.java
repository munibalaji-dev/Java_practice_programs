package Arrays;

public class IsSortOrNot {
    static boolean isSorted(int[] arr) {
        int n = arr.length;
        if (n <= 1) return true;

//        for (int i=1;i< arr.length-1;i++){
//            if (arr[i]>arr[i+1]){
//                return false;
//            }
//        }
//        return true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,6,7};
//          int[] arr = {1,2,31,42,15,16,7};
        System.out.println(isSorted(arr));
    }
}
