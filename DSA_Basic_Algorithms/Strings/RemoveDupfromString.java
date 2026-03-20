package DSA_Basic_Algorithms.Strings;

public class RemoveDupfromString {
    public static void main(String[] args) {
        String str = "Laptop";
        String result = "";

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1){  // here if the character ch is not already present in result, then add it
                result += ch;
            }
        }
        System.out.println(result);


    }
}
