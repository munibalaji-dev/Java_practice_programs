package DSA.Code_With_J;

public class Day6RemovingZerosAndAddingToLast {
    public static void main(String[] args){
        int[] arr = {1,0,2,3,0,0,4,0,5};
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                System.out.print(arr[i]+",");
            }
        }
        for (int j=0;j<arr.length;j++){
            if (arr[j]==0){
                System.out.print(arr[j]+",");
            }
        }
    }
}
