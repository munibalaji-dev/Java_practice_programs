package _Scalar_DSA_.Arrays;

import java.util.Scanner;

public class Sachin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] runs = new int[664];
//
//        for (int i=0;i<6;i++) {
//            runs[i] = sc.nextInt();
//        }
//        for (int i = 0;i<6;i++){
//            System.out.println("Runs in "+i+"  th match is :"+runs[i]);
//        }
//



////        Find Average of Sachin for 5 matches
//        int sum = 0;
//        for (int i=0;i<5;i++){
//            sum += runs[i];
//        }
////        double avg = sum/5.0;
//        double avg = (double) sum/5;
//        System.out.println(avg);






//        User Want to give the size of an array

//        System.out.println("Enter Size Of an array : ");
//        int n = sc.nextInt();
//        int[] runs = new int[n];
//
//        for (int i= 0;i<n;i++) {
//            System.out.println("Enter Runs Scored in "+i+"  Match");
//            runs[i] = sc.nextInt();
//        }
//            for (int i=0;i<n;i++){
//            System.out.println("Runs in "+i+"  th match is :"+runs[i]);







//      Take n from user and take runs for n different matches
//      find min and max from it
//        System.out.println("Enter Size Of an array : ");
//        int n = sc.nextInt();
//        int[] runs = new int[n];

//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter Runs Scored in " + i + "  Match");
//            runs[i] = sc.nextInt();
//        }
//






////        Finding the Max and Min Runs
//        int max = runs[0];
//        int min = runs[0];
//        for (int i = 0; i < n; i++) {
//            if (max < runs[i]) {
//                max = runs[i];
//            }
//
//            if (min > runs[i]) {
//                min = runs[i];
//            }
//        }
//        System.out.println("The Maximum Runs is : " + max);
//        System.out.println("The Minimum Runs is : " + min);





        int[] arr = {10,43,54,53,34,3};
        int[] res = minAndMax(arr);

        System.out.println("Min is :"+res[0]);
        System.out.println("Max is : "+res[1]);

    }

//     problem : Give array in function and ask them to return min and max from it.
    public static int[] minAndMax(int[] arr) {
//        return 0 index value as min and 1 as max
        int[] res = new int[2];
        int min = arr[0];
        int max = arr[0];

//        To find the length of an array /size of an array --> arr,length
        for (int i=1;i< arr.length;i++){

//            if (arr.length==0){
//                int[] res ={-1,-1};
//                return res;
//            }
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
}
