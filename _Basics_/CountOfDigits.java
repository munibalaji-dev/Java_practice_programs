package _Basics_;

public class CountOfDigits {
    public static void main(String[] args) {

        int n = 123423456;
        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println("Count of digits = " + count);
    }
}