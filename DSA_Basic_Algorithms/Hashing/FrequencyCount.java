package DSA_Basic_Algorithms.Hashing;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1};

        // Brute force approach

//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        int[] freq = new int[max+1];
//
//        for (int i = 0; i < arr.length; i++){
//            freq[arr[i]]++;
//        }
//
//        for (int i = 0; i < freq.length; i++){
//            System.out.println(i+ "->" +freq[i]);
//        }


        // Optimized approach
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
//            if (map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1);
//            }else {
//                map.put(arr[i], 1);
//            }

            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
    }
}
