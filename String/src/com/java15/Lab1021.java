package com.java15;

public class Lab1021 {

	public static void main(String[] args) {

		String str1 = "SDL";
		String str2 = "INDIA";

		String str3 = str1+str2;
		String str4 = str1+"INDIA";
		String str5 = "SDL"+str2;
		
		System.out.println(str3+"\t"+str4+"\t"+str5);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		System.out.println(str3 == str5);
		
	}
}
