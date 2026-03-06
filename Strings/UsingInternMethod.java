package _String_programs_;

public class UsingInternMethod {
    public static void main(String[] args) {

        String s = new String("Java");
        String s1 = s.intern();
        String s2 = "Java";
        System.out.println(s1==s2);
    }
}
