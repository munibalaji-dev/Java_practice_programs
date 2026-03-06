package Strings;

public class Palindrome {
    public static void main(String[] args) {

        boolean ispal = true;
        String pal = "racecar";
        int left = 0;
        int right = pal.length() - 1;

        while (left < right) {
            if (pal.charAt(left)!=pal.charAt(right)){
                ispal = false;
                break;
            }
            left++;
            right--;
        }
        if (ispal){
            System.out.println("The String is palindrome :" +pal);
        }
        else {
            System.out.println("The String is not palindrome :" +pal);
        }
    }
}
