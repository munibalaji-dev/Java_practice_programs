package _String_programs_;

public class VowelConsonentCalculator {

    public static void main(String[] args) {

        String finding = "Automation World";

        finding = finding.toLowerCase();
        int vowels = 0,consonents = 0;

        for (int i=0;i<finding.length();i++){

            char ch = finding.charAt(i);
            if (ch>='a'&&ch<='z'){
                if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
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
