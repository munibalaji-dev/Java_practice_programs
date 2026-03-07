package DSA_Basic_Algorithms.Recursion;

public class Print_From_Nto1 {
    static void function(int i, int n){
        //Base Case
        if(i<1){
            return;
        }
        System.out.println(i);
        function(i-1, n);

    }

    public static void main(String[] args) {
        int n = 5;
        function(n, n);
    }
}
