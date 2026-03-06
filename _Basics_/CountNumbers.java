package _A2Z_Striver_Sheet_;

import static java.lang.Math.log10;

public class CountNumbers {

    public static void main(String[] args) {

//        int n = 4567;
//        int count = 0;
//
//        while(n>0){
//            count = count+1;
//            n = n/10;
//        }
//        System.out.println(count);

        int n =1234;
        int count = (int)(log10(n)+1);
        System.out.println(count);
    }
}
