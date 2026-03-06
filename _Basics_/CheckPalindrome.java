package _A2Z_Striver_Sheet_;

public class CheckPalindrome {

    public static void main(String[] args) {

        int n = 1221;
        int duplicate = n;
        int revNum = 0;

        while (n>0){  // Reverse Logic
            int lastDigit = n%10;
            revNum = (revNum*10)+lastDigit;
            n = n/10;
        }
        if (revNum==duplicate){
            System.out.println("It is a palindrome : "+duplicate);
        }
        else {
            System.out.println("Not Palindrome : "+duplicate);
        }
    }
}
