package DSA.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class NonRepeatedIntegers {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(4);
//        list.add(5);
//        list.add(2);
//        list.add(6);
//        list.add(4);
//        list.add(7);
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int nums : list){
//            map.put(nums, map.getOrDefault(nums,0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if (entry.getValue()== 1){
//                System.out.print(entry.getKey());
//            }
//        }
//
//    }

    static void nonRepeatedIntegers(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(list.get(i));
            }
        }
    }
        public static void main(String[] args) {
            // int[] arr = {10,20,30,40,50};
            //  int sum = Arrays.stream(arr).sum() ;
            //   for(int abc : arr){
            //         sum+=abc;
            //   }
            //   System.out.println(sum);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the arraylist size : ");
            int n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                System.out.print("Enter element at "+i+" index : ");
                int value = sc.nextInt();
                list.add(value);
            }
//            System.out.println(nonRepeatedIntegers(list));
            nonRepeatedIntegers(list);
    }
}
