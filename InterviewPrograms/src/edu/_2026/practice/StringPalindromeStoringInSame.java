package src.edu._2026.practice;


public class StringPalindromeStoringInSame {
    public static void main(String[] args) {
        String str = "abcdedcba";
        char[] charArray = str.toCharArray();
        int i = charArray.length - 1;
        int j = 0;
        boolean isPalindrome  = true;
        while (i > j) {
            if (charArray[i] != charArray[j]) {
                isPalindrome  = false;
                break;
            }
            i--;
            j++;
        }
        System.out.println((isPalindrome ) ? "Palindrome" : " Not Palindrome");
    }
}


