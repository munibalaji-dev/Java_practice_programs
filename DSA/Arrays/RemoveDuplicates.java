package DSA.Arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []arr = {2,3,2,4,4,10,5,1};
        Set<Integer> st = new HashSet<>();
        for (int num : arr){
            st.add(num);
        }
        System.out.println("Before Removing Duplicates : "+ Arrays.toString(arr));
        System.out.println("After Removed Duplicates An Array is : "+st);
    }
}
