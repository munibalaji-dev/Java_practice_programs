package _A2Z_Striver_Sheet_;

public class PrintAllDivisors {

    public static void main(String[] args) {

        int n = 42;

        for (int i = 1 ; i <= n ; i++){
            if (n%i==0){
                // We choose Only print because we want numbers which are divisible by 36,in a single line
                System.out.print(i);
            }
        }
    }
}
