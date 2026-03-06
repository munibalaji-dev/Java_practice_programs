package _A2Z_Striver_Sheet_;


//Complete the function printNumber which takes an integer input from the user and prints it on the screen.


import java.util.Scanner;

public class UserInput {

    public void printNumber(Scanner sc){
        int num = sc.nextInt();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserInput obj = new UserInput();
        obj.printNumber(sc);
    }
}
