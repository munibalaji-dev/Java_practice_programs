package Arrays;

public class AscOrDes {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {5,1,4};

          int[] arr = {112,32,43,45};
        boolean ascending = true;
        boolean descending = true;
        for (int i=0;i<arr.length-1;i++){  // arr.length-1; it is helpful to avoid ArrayIndexOutOfBoundsException
            if (arr[i]>arr[i+1]){          // You cannot do better than O(n). Because you must look at every element at least once to be sure. So yes — this is optimal.
                ascending = false;
//                break;
            }
            if (arr[i]<arr[i+1]){
                descending = false;
//                break;
            }
        }
        if (ascending) {
            System.out.println("Array Is In Ascending Order ");
        } else if (descending) {
            System.out.println("Array Is In Descending Order ");
        }
        else {
            System.out.println("Array Is Not Sorted ");
        }
    }
}
