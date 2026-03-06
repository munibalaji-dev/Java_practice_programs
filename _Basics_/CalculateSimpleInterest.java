package _Basics_;

import java.util.Scanner;

public class CalculateSimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        double value = sc.nextDouble();


        System.out.println("Enter Rate Of Interest : ");
        double rateOfInterest = sc.nextDouble();

        System.out.println("Enter Number of months : ");
        int TimeOfDuration = sc.nextInt();

        double interest = value*rateOfInterest*TimeOfDuration/100;



        System.out.println("Interest For Your Money :" +interest);

        sc.close();
    }
}
