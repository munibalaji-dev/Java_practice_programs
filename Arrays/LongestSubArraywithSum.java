package Arrays;

public class LongestSubArraywithSum {


    // Brute Force
//    int maxLength = 0;
//        for(int i=0;i< arr.length;i++) {
//        for (int j = i; j < arr.length; j++) {
//            int sum =0;
//            for (int h = i; h <= j; h++) {  -- We Can remove this for loop also, To reduce the TC from n cube to n square
//                sum += arr[h];
//
//            }
//            if (sum == k) {
//
////             maxLength = Math.max(maxLength, j - i + 1);
//
//                int currentLength = j-i+1;
                    // Without Math.max function write like below, we can Compare maxLength with currentLength (j - i + 1) and store the bigger value in maxLength.
//                if (currentLength>maxLength){
//                    maxLength = currentLength;
//                }
//            }
//        }
//    }
//        System.out.println(maxLength);
//}

    // Optimized approach using two pointer technique
    static int subArray(int[] arr, int k) {
        int left = 0, right = 0, sum = 0, maxLength = 0;
        int n = arr.length;
        sum = arr[0];

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        int k = 6;

        System.out.println(subArray(arr, k));
    }
}
