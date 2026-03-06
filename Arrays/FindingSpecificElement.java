package _Scalar_DSA_.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

//Given an arraylist in which all elements are present two times except one single element.Find that single element
public class FindingSpecificElement {


    public static int findEle(ArrayList<Integer> list){

        for (int i=0;i<list.size();i++) {
            int value = list.get(i);
            int cnt = 0;
            for (int j=0;j< list.size();j++)
            {
                if (list.get(j)==value)
                {
                    cnt++;
                }

                    if (cnt == 2) {
                        break;
                    }
                }
                if (cnt == 1){
                    return value;
            }
        }
        return 0;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ArraySize : ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            System.out.println("Enter Element At Index : "+i);
            int element = sc.nextInt();

            list.add(element);
        }
        System.out.println("Single Element is :"+findEle(list));
    }
}
