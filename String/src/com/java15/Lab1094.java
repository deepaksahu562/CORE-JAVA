package com.java15;

public class Lab1094 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JLC");
		StringBuilder sb1 = new StringBuilder("JLC");
		System.out.println(sb.equals(sb1));
		
		String str1 = sb.toString();
		String str2 = sb1.toString();
		System.out.println(str1.equals(str2));
		System.out.println(str1);
		System.out.println(sb+"hi");
		
	}

}
