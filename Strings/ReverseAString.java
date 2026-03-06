package _String_programs_;

public class ReverseAString {

    public static void main(String[] args) {

        String beforeReverse = "BALUU";

        String afterReverse = new StringBuilder(beforeReverse).reverse().toString();

        System.out.println("AFter Reverse a String It is : "+afterReverse);

    }
}
