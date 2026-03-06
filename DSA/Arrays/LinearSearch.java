package DSA.Arrays;

//class Search {
//    public void searching(int arr[],int num){
//        for (int i=0;i< arr.length;i++){
//            if (arr[i] == num) {
//                System.out.println("Index is : "+arr[i]);
//            }
//        }
//    }
//}
public class LinearSearch {

    public static void main(String[] args) {


//        LinearSearch obj = new LinearSearch();
//        obj.searching(new int[]{0,1, 2, 3, 4, 5},4);


        int[] arr = {1,2,3,5,4,5};
        int num = 4;

        for (int i=0;i< arr.length;i++){
            if (arr[i] ==num){
                System.out.println(arr[i]);
            }
        }

    }
}
