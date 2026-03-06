package _Basics_;

import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value : ");
        int a = sc.nextInt();

        System.out.println("Enter B value : ");
        int b = sc.nextInt();

        System.out.println("Values Before Swapping : A is : " +a+ "  B is : " +b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Values After Swapping : A is : "+a+ "  B is : "+b);

        sc.close();

    }
}