package DSA_Basic_Algorithms.Recursion;

// Print Name N Times using recursion
public class Print_N_times {

    static void printNames(int i,int n){
        // Base Case
        if (i>n){
            return;
        }
        System.out.println("Using Recursion ");
        printNames(i+1,n);
    }
    public static void main(String[] args) {

        int n = 5;

        printNames(1,n);
    }
}
