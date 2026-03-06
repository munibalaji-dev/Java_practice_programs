package Strings;

public class CountFrequency {
    public static void main(String[] args) {

        String s = "Balaji";
        int[] freq = new int[256];

        for (char ch : s.toCharArray()){
            freq[ch]++;
        }
        for (int i=0;i<256;i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ":" + freq[i]);
            }
        }
    }
}
