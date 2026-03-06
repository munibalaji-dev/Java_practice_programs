package DSA.Code_With_J;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Day7UnionOfArrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,2,3,4,4,5,5};
        int[] arr2 = {1,2,3,4,3,2,4,5,6};

        Set<Integer> st = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            st.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){
            st.add(arr2[j]);
        }
        System.out.print("Union Of Array is : ");
        for (int value : st){
            System.out.print(value+",");
        }
    }
}
