package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,1,2,5,3,3,3,4,4,5};

//        Arrays.sort(arr);
        int rd = 0;
        for (int i=1;i< arr.length;i++){
            if (arr[rd]!=arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
      int uniqueCount = rd+1;

        // Step 3: Print result
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }

//        Set<Integer> st = new LinkedHashSet<>();
//        for (int num : arr){
//            st.add(num);
//        }
//        int[] uniqueArray = st.stream().mapToInt(Integer::intValue).toArray();
//
//        System.out.println("Original Array: " + Arrays.toString(arr));
//        System.out.println("Array Without Duplicates: " + Arrays.toString(uniqueArray));

//        System.out.println(Arrays.toString(arr));
    }
}
