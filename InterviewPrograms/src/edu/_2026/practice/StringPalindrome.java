package src.edu._2026.practice;

import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "aba";
        char[] charArray = str.toCharArray();
        char[] reverseArray = new char[str.length()];
        int length = charArray.length;
        int i = length-1;
        int j = 0;
        while(i>=0){
            reverseArray[j] = charArray[i];
            i--; j++;
        }
        if(Arrays.equals(charArray,reverseArray)){
            System.out.println("Pallendram");
        }else {
            System.out.println("not Pallendram");
        }

    }
}
