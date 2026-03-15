package DSA.Arrays;

public class FindingMaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,1,1,5};
        int cnt =0,maxcnt = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 1) cnt++;
            else cnt = 0;
            if (cnt > maxcnt) maxcnt = cnt;
        }
        System.out.println("In this Array Maximum Consecutive ones are : "+maxcnt);
    }
}
