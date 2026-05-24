package com.test;

public class String_Pailendrom {

	public static void main(String[] args) {
		boolean check=isPalindrome(args[0]);
		System.out.println(check);
	}
	private static boolean isPalindrome(String str) {
	    if (str == null)
	        return false;
	    StringBuilder strBuilder = new StringBuilder(str);
	    strBuilder.reverse();
	    return strBuilder.toString().equals(str);
	}

}
