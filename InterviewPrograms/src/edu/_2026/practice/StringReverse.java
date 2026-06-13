package src.edu._2026.practice;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "abcdef";
        stringReverseViaCharAt(str);
        stringReverseViaArray(str);
    }

    private static void stringReverseViaCharAt(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    private static void stringReverseViaArray(String str) {
        char[] charArray = str.toCharArray();
        char[] reverseArray = new char[str.length()];
        int length = charArray.length;
        int i = length - 1;
        int j = 0;
        while (i >= 0) {
            reverseArray[j] = charArray[i];
            i--;
            j++;
        }
        System.out.println(reverseArray);
    }
}
