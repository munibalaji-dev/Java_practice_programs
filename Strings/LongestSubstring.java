package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubString(String s){
        int left = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);

        }
            return maxLength;
    }
    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubString(s));
    }
}
