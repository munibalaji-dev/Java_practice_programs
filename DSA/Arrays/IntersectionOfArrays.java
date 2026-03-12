package DSA.Arrays;
import java.util.Set;
import java.util.HashSet;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 6, 7};

        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    st.add(arr1[i]);
                }
            }
        }
        System.out.print("Intersection Of Array is : ");
        for (int val : st) {
            System.out.print(val + ",");
        }
    }
}
