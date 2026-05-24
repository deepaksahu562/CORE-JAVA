package com.java15;

public class Lab1144 {

	public static void main(String[] args) {

		byte byy1 =123;
		byte byy2 =123;
		System.out.println(byy1 == byy2);
		
		Byte by1 =123;
		Byte by2 =123;
		System.out.println(by1 == by2);
		
		byte b =123;
		Byte b1 = new Byte(b);
		Byte b2 = new Byte(b);
		System.out.println(b1 == b2);
		
	}

}
