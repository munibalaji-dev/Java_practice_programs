package DSA_Basic_Algorithms.Recursion;

// Print linearly from 1 to N (using BackTracking)
public class Print_1toN_By_BackTracking {

    static void backTracking(int i, int n){
        //Base Case
        if(i<1){
            return;
        }
        backTracking(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 5;
        backTracking(n, n);
    }
}
