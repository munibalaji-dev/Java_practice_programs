package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubString(String s){
        int left = 0;
        int maxLength = 0;

    // Brute Force Approach
//        Set<Character> set = new HashSet<>();
//        for(int right = 0; right < s.length(); right++) {
//            char current = s.charAt(right);
//
//            while (set.contains(current)) {
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(current);
//            maxLength = Math.max(maxLength, right - left + 1);
//        return maxLength;
//
//        }

    // Optimized Approach
    HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right<s.length();right++)

    {

        char current = s.charAt(right);

        if (map.containsKey(current) && map.get(current) >= left) {
            left = map.get(current) + 1;
        }
        map.put(current, right);

        maxLength = Math.max(maxLength, right - left + 1);
    }
            return maxLength;
}

//      If they ask to return the substring then the following code will be useful :
//        public static String lengthOfLongestSubString(String s){
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        int left = 0;
//        int maxLength = 0;
//        int startIndex = 0;
//
//        for (int right = 0; right < s.length(); right++){
//            char current = s.charAt(right);
//
//            if (map.containsKey(current) && map.get(current) >= left){
//                left = map.get(current)+1;
//            }
//            map.put(current, right);
//            if (right-left+1 > maxLength){
//                maxLength = right-left+1;
//                startIndex = left;
//            }
//        }
//            return s.substring(startIndex, startIndex+maxLength);
//
//    }

    public static void main(String[] args) {

        String s = "abczabcbb";
        System.out.println(lengthOfLongestSubString(s));
    }
}
