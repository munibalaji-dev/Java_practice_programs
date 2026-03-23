package Arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {

        int []arr1 = {1,1,2,0,1,1,1,1,3,1,1,1};

        int count=0;
        int maxCount=0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            if (count > maxCount){
                maxCount = count;
            }
        }
        System.out.println("Maximum Consecutive Ones Are : "+maxCount);
    }
}
