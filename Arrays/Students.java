package _Scalar_DSA_.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        Discussion on arraylist
        int n = sc.nextInt();

        ArrayList st = new ArrayList<>();

//        Declaration of arraylist
        for (int i=0;i<n;i++) {
            int val = sc.nextInt();
//        add value in the end of the list
            st.add(val);
        }
//    Print User loop
        for (int i=0;i< st.size();i++){
            System.out.print(st.get(i) +" ");
        }
        System.out.println();

//        Add 3 more insertions
        for (int i=0;i<3;i++){
            System.out.println("Add 3 Elements to the existing arraylist :");
            int val = sc.nextInt();;
            st.add(val);
        }
//        Arraylist print using sop
        System.out.println(st);


//        Removing element from arraylist

        int rem =(int) st.remove(st.size()-1);
        System.out.println("Removed Value : "+rem);
        System.out.println(st);


        // Set an Index
        System.out.println("Set an Index");
        st.set(3,10);
        System.out.println(st);

//        Add An element in between the list
        System.out.println("Added An element in between the list of index 2");
        st.add(2,30);
        System.out.println(st);

    }
}
