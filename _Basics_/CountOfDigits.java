package _Basics_;

public class CountOfDigits {
    public static void main(String[] args) {
         int n = 123423456;
         int count = 0;
         while (n>0){
             n = n/10;     // remove the last digit 1234/10==>123...123/10==>12....12/10==>2...1/10==0 remainder is 1 then it will printed
             count++;    //// increase the counter

         }
        System.out.println("The count of a number is : "+count);
    }
}
