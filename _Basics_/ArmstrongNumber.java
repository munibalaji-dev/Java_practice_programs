package _A2Z_Striver_Sheet_;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int n = 121;
        int dup = n;
        int sum = 0;

        while(n>0){
            int lastDigit = n%10;
            sum = sum+(lastDigit*lastDigit*lastDigit);
            n = n/10;
        }
        if (sum == dup){
            System.out.println(dup+"  is ArmStrong Number ");
        }
        else {
            System.out.println(dup+" is not ArmStrong Number ");
        }
    }
}
