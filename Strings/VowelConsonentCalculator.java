package Strings;

public class VowelConsonentCalculator {

    public static void main(String[] args) {

        String name = "Automation World";

        name = name.toLowerCase();
        int vowels = 0,consonents = 0;

        for (int i=0;i<name.length();i++){

            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u'){
                    vowels++;
                }
                else {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels Are :" +vowels);
        System.out.println("Consonents are :"+consonents);
    }
}
