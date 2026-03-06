package _Scalar_DSA_.Arrays;
import java.util.Arrays;
import java.util.Scanner;

//Write a program to print the input array A of size N in reverse order where you have to take integer N and further N elements as input from user.
public class PrintInReverse {

    public static void main(String[] args) {

        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter Array Element At : "+arr[i]);
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse An Array Is : "+ Arrays.toString(arr));


        System.out.print("After Reverse An Array : [");
        for (int i=n-1;i>=0;i--){
            System.out.print(arr[i]);

            if (i !=0){ // i never be not equal to zero so comma print after an element printed
                System.out.print(", ");
            }
        }
        System.out.println("]");
//        System.out.println("After Reverse An Array is : "+temp);

    }
}
