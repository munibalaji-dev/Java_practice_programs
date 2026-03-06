package DSA_Basic_Algorithms.Recursion;

public class Example {
   static int count =0;
    static void hello(){
        if (count == 3){
            return;
        }
        else {
            System.out.println(count);
            count++;
            hello();
        }
    }
    public static void main(String[] args) {

        hello();
    }
}
