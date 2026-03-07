package DSA_Basic_Algorithms.Recursion;

// Print N to 1 using BackTracking
public class Print_Nto1_By_BackTracking {

    static void backTracking(int i, int n){
        // Base Case
        if(i>n){
            return;
        }
        backTracking(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {

        int n = 5;
        backTracking(1, n);
    }
}
