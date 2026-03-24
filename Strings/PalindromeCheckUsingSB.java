package Strings;

public class PalindromeCheckUsingSB {
    public static void main(String[] args) {

        String str = "RacecaR";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String s = new String(sb);
        if(s.equals(str)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not palindrome String");
        }
    }
}
