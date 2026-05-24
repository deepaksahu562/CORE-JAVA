package com.java15;

public class Lab813 {

	public static void main(String[] args) {
		new Hello813().show();
	}
}

class Hai813{
	static int a = 10;
}

class Hello813 extends Hai813{
	static int a = 20;
	static void show(){
		int a = 30;
		System.out.println(a);
		System.out.println(Hello813.a);
		System.out.println(Hai813.a);
	}
}
