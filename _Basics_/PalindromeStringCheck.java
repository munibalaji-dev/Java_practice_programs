package _Basics_;

import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {

//     How it works:
//
//Creates a new StringBuilder object.
//
//Reverses the characters inside it (O(n) operations).
//
//Converts the reversed StringBuilder back into a new String (O(n) again).
//
//Compares original string with reversed string (O(n)).
//
//Time Complexity: O(n) (still linear, because of reversing + comparing).
//
//Space Complexity: O(n) (extra space needed for reversed string).


//        String s = "racecar";
//        StringBuilder sb = new StringBuilder(s);
//        String rev = sb.reverse().toString();
//        if (s.equals(rev)){
//            System.out.println("It is Palindrome : "+s);
//        }else {
//            System.out.println("It is not Palindrome : "+s);
//        }


//How it works:
//Uses two pointers (start & end).
//Compares characters in-place, without creating extra strings.
//If mismatch → not palindrome, stop early.
//Time Complexity: O(n) (same linear check).
//Space Complexity: O(1) (no extra memory used).


//        String name = "racecar";  //Any middle element (if odd length) doesn’t matter — it’s equal to itself.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not ");
        String name = sc.nextLine();

//        String clean = name.replaceAll("[^a-zA-Z0-9]+$","").toLowerCase();

        boolean isPalindrome = true;

        int left = 0;
        int right = name.length()-1;

        while (left < right){
            if (name.charAt(left)!= name.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("It is Palindrome: " + name);
        } else {
            System.out.println("It is not Palindrome: " + name);
        }

    }
}
