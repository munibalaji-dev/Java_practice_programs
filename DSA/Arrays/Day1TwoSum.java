package DSA.Code_With_J;

public class Day1TwoSum {
    public static void main(String[] args) {
        int []nums = {2,4,6,5,6,4};
        int target = 9;
        int []result = twoSum(nums,target);
        if (result.length==2){
            System.out.println("Indices :["+result[0]+","+result[1]+"]");
        }
        else {
            System.out.println("No Solutions Found");
        }
    }
    public static int[] twoSum(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
