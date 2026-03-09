package DSA_Basic_Algorithms.Recursion;

public class SumOfFirst_N_Numbers {

    //Using Parameterized way
//    static void func(int i, int sum){
//        if (i<1){
//            System.out.println(sum);
//            return;
//        }
//        func(i-1,sum+i);
//    }


//     Using Functional Way
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);

    }

    public static void main(String[] args) {

        int n = 3;
//        func(n,0);
        System.out.println(sum(n));
    }
}
