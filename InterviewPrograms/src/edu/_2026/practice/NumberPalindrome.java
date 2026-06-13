package src.edu._2026.practice;

public class NumberPalindrome {
    public static void main(String[] args) {

        int number = 123454321;
        int temp = number;
        int result = 0;
        while (number>0){
            int reminder = number%10;
            result = result*10 + reminder;
            number = number/10;
        }
        System.out.println((result == temp)? "Palindrome" : "No Palindrome");
    }
}
