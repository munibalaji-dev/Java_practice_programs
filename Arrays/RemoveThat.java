package Arrays;

//Write a program to input N numbers array, A from the user and an integer X and print the array by deleting element at specified position X.
import java.util.Arrays;
import java.util.Scanner;

public class  RemoveThat {

//    public static void removeThat(int[] A,int X){
//
//        if (X>= A.length||X<0){
//            System.out.println("Invalid Number");
//            return;
//        }
//            for (int i=X;i<A.length-1;i++){
//                A[i] = A[i+1];
//            }
//
//        }
    static int[] removeThat(int[] A,int X){
        if (X >= A.length || X<0){
            System.out.print("Invalid Number : ");
        }
        int j = 0;
        int[] newArray = new int[A.length-1];
        for (int i=0; i<A.length; i++){
            if (i != X){
                newArray[j++] = A[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n= sc.nextInt();

        int[] A = new int[n];

        for (int i = 0; i < A.length; i++){
            System.out.println("Enter Element at "+i+"th Index :");
            A[i] = sc.nextInt();
        }

        System.out.println("Enter X Value :");
        int X = sc.nextInt();

        System.out.println(Arrays.toString(removeThat(A,X)));
//        System.out.println(Ar5
//        rays.toString(A));
    }
}
