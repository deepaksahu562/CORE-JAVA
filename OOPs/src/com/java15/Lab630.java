package com.java15;

public class Lab630 {

	public static void main(String[] args) {
		System.out.println("Main :"+Hello630.b);
	}
}

class Hello630{
	static{
		System.out.println("SB1 :"+Hello630.b);
	}
	static int b = 20;
	
	static{
		System.out.println("SB2 :"+b);
		System.out.println("SB2 :"+Hello630.b);
	}
}
