package com.java15;

public class Lab614 {

	public static void main(String[] args) {
		//new Hello614(5);
		new Hello6140();

	}
}

class Hello614{
	public Hello614() {
		//this(5);
		System.out.println("Hello614()");
	}
	
	public Hello614(int a) {
		this();
		System.out.println("Hello614(int a)");
	}
}

class Hello6140{
	public Hello6140() {
		this(5);
		System.out.println("Hello614()");
	}
	
	public Hello6140(int a) {
		System.out.println("Hello614(int a)");
	}
}
