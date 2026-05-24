package com.java15;

public class Lab732 {

	public static void main(String[] args) {
		Hai732 hai = new Hai732();
		hai.a = 99;
		Hello732 h = new Hello732();
		System.out.println("main beg :"+hai.a);
		h.m1(hai);
		System.out.println("main end :"+hai.a);
	}
}

class Hello732{
	void m1(Hai732 hai){
		System.out.println("m1 beg :"+hai.a);
		hai = new Hai732();
		hai.a = hai.a+10;
		System.out.println("m1 end :"+hai.a);
	}
}

class Hai732{
	int a;
}
