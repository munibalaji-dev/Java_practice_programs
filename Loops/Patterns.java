package Loops;

import java.util.Scanner;

import static java.lang.Math.min;

public class Patterns {
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=n-i-1;j++){ // understand condition
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i=1;i<=n;i++){
            for (int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            for (int star=0;star<2*i-1;star++){
                System.out.print("*");
            }
            for (int space=0;space<n-i;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i=0;i<n;i++){
            for (int space=0;space<i;space++){
                System.out.print(" ");
            }
            for (int star=0;star<2*n-(2*i+1);star++){ // check condition (+) and (-) becomes (-)
                System.out.print("*");
            }
            for (int space=0;space<i;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i=0;i<n;i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for(int space=0;space<i;space++){
                System.out.print(" ");
            }
            for (int star=0;star<2*n-(2*i+1);star++){
                System.out.print("*");
            }
            for (int space=0;space<i;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i=0;i<2*n-1;i++){
            int star = i;
            if (i>n) star = 2*n-i;
            for (int j=0;j<star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        int start = 1;
        for (int i=0;i<n;i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j <=i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){

        int space = 2*(n-1); // 2*(5-1) 2*4 = 8 spaces
        for (int i=1;i<=n;i++){

            //numbers
            for (int num=1;num<=i;num++){
                System.out.print(num);
            }
            //space
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for (int num=i;num>=1;num--){
                System.out.print(num);
            }
            System.out.println();
            space -= 2;
        }
    }
    static void pattern13(int n){
        int num = 1;
        for (int i=0;i<n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num);
                num = num+1;
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for (int i=0;i<n;i++){
            for (char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for (int i=0;i<n;i++){
            for (char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        for(int i=0;i<n;i++){
            char ch = (char) ('A'+ i);
            for (int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i=0;i<n;i++){
            //spaces
            for (int space = 0; space < n-i-1; space++){
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;

            for (int j = 0; j < 2*i+1; j++){

                System.out.print(ch);
                if (j<=breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
        for(int i = 0; i < n; i++){
            //spaces
            for (int space = 0; space < n-i-1; space++){
                System.out.print(" ");
            }
            //characters
            char ch = 'A';
            for (int j=0; j < 2*i+1; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern19(int n){

        for(int i = 0; i < n; i++){
            for(char ch = (char)('E'-i); ch <= 'E'; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void pattern20(int n){
        int initialSpace = 0;

        for(int i = 0; i < n; i++){
            // stars
            for(int j = 1; j <= n-i; j++){
                System.out.print("*");
            }
            // spaces
            for (int space = 0; space < initialSpace; space++){
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n-i; j++){
                System.out.print("*");
            }

            initialSpace +=2;
            System.out.println();
        }
//        initialSpace = 8; Hardcoding
        initialSpace = 2* n-2;

        for (int i = 1; i <= n; i++){
            // stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // spaces
//            for (int space=0;space<=2*n-(2*i+2);space++){
            for (int space = 0; space < initialSpace; space++){
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            initialSpace -= 2;
            System.out.println();
        }
    }
    static void pattern21(int n){
        int initialSpace = 2*n-2;

        for (int i = 1; i < 2*n-1; i++){
            int stars = i;
            if (i > n) stars = 2*n-i;  // 2*5-6 = 4
            // stars
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            // spaces
            for (int space = 1; space <= initialSpace; space++){
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            if (i < n) initialSpace -= 2;
            else initialSpace += 2;
            System.out.println();


        }
    }
    static void pattern22(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if ( i == 0 || j == 0 || i == n-1 || j == n-1 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern23(int n){

        for (int i = 0; i < 2*n-1; i++){

            for (int j = 0; j < 2*n-1; j++){

                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int down = (2*n-2) - i;
                System.out.print(n - min(min(top, down), min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of testcases : ");
        int t = sc.nextInt();

        for (int i=0;i<t;i++){
            System.out.println("Enter n value : ");
            int n = sc.nextInt();
            pattern23(n);

        }
    }
}
