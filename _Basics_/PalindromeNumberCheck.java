package _Basics_;

public class PalindromeNumberCheck {

    public static void main(String[] args) {
        int n = 113311;
        int dup = n;
        int revNum = 0;
        int lastDigit = 0;

        while (n > 0) {
            lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("The Actual Number : " + dup);


        if (dup == revNum){
            System.out.println("It is Palindrome "+revNum);
        }else {
            System.out.println("It is not palindrome : "+dup);
        }
    }
}
