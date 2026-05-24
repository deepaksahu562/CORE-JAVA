package com.java15;

public class Lab1025 {

	public static void main(String[] args) {
		
		//String str1 = "JLC";
		//String str2 = "INDIA";

		final String str1 = "JLC";
		final String str2 = "INDIA";
		
		String str3 = str1.concat(str2);
		
		String str4 = "JLCINDIA";
		String str5 = str1+str2;
		String str6 = "JLC"+"INDIA";
		
		System.out.println(str4 == str6);
		System.out.println(str4.hashCode()+"::" +str5.hashCode());
		System.out.println(str4 == str5);
		System.out.println(str3 == str4);
		
	}

}
