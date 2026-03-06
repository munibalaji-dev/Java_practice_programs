package _Looping_Statements_;

public class HollowAlphabetPattern {
    public static void main(String[] args) {

        int n =5;
        char ch ='A';

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(j==1||j==i||i==n){
                    System.out.print(ch+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            ch++;
        }
    }

}
