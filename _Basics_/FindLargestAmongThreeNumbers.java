package _Basics_;

import java.util.Scanner;

public class FindLargestAmongThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter A Number : ");
        int A = sc.nextInt();

        System.out.println("Enter B Number : ");
        int B = sc.nextInt();

        System.out.println("Enter C Number : ");
        int C = sc.nextInt();


//        if (A >= B && A >= C)
//            System.out.println("A Is Bigger Number : " + A);
//
//        else if (B >= A && B >= C)
//            System.out.println("B Is Bigger Number : " + B);
//        else
//            System.out.println("C Is Bigger Number : " + C);

        int largest = A;

        if (B > largest){
            largest = B;
        }
        if (C > largest){
            largest = C;
        }

        System.out.println("Largest Number : "+largest);

    }


}
