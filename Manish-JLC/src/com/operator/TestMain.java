package com.operator;

public class TestMain {

	public static void main(String[] args) {
		int a = 10;
		int b = a++ + ++a;
		System.out.println(a);
		System.out.println(b);
	}

}
