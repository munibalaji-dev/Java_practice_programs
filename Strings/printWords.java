package Strings;

import java.util.Scanner;

public class printWords {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] res = wordsPrint(s);
        for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]+" ");
        }
    }

    public static int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return s.charAt(0) == ' ' ? count : count + 1;
    }

    public static String[] wordsPrint(String s) {


        int count = countWords(s);
        System.out.println(count);

        String[] res = new String[count];
        int j = 0;
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                a = a + s.charAt(i);
            } else if (a.length() > 0) {
                res[j] = a;
                j++;
                a = "";
            }
        }

        if (a.length() > 0) {
            res[j] = a;
        }

        return res;
    }
}
