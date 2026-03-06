package _Scalar_DSA_.Arrays;

import javax.swing.text.Element;
import java.util.Scanner;

public class SearchingAnElement {

//    public static boolean isSearch(int[] A,int k){
//
//        boolean isToFind = false;
//        for (int i=0;i< A.length;i++){
//            if (A[i] == k){
//                isToFind = true;
//                break;
//            }
//        }
//        return isToFind;
//    }


    public static boolean search(int[] A,int k){

        for (int i=0;i<A.length;i++){
            if (A[i]==k){
                return true;  // return immediately if found
            }
        }
        return false;   // return false if not found
    }
    public static void main(String[] args) {
//        int k = 9;
//        int[] A = {1,2,5,9,3,3};
//        boolean isFound = Search(A,k);  // Pass both arguments
//        System.out.println("Element :"+k +"Found :"+isFound);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of An Array : ");
        int n = sc.nextInt();

        int[] A = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("Enter Element at "+i+"th Index : ");
            A[i] = sc.nextInt();
        }
        System.out.println("Enter K Value : ");
        int k = sc.nextInt();
        System.out.println(search(A,k));
    }
}
