package DSA_Basic_Algorithms.Recursion;

public class Print_Linearly_From_1toN {
    static void function(int i, int n){

        //Base Case
        if(i>n){
            return;
        }
        System.out.println(i);
        function(i+1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        function(1, n);
    }
}
