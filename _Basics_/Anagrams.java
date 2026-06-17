package _Basics_;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaramw";

        System.out.println(isAnagram(s1, s2));

//        s1 = s1.toLowerCase();
//        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()){
            System.out.println("Strings are not anagrams");
            return;
        }
//
//        char[] string1 = s1.toCharArray();
//        char[] string2 = s2.toCharArray();
//        Arrays.sort(string1);
//        Arrays.sort(string2);
//
//        if (Arrays.equals(string1, string2) == true){
//            System.out.println("Strings are anagrams");
//        }else {
//            System.out.println("Strings are not anagrams");
//        }
    }

    public static boolean isAnagram(String s1, String s2){
        boolean value = false;

        char[] abc = s1.toCharArray();
        char[] bcd = s2.toCharArray();

        Arrays.sort(abc);
        Arrays.sort(bcd);

        if (Arrays.equals(abc, bcd)){
            value = true;
        }
        return value;
    }
}
