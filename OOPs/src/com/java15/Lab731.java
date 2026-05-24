package com.java15;

public class Lab731 {

	public static void main(String[] args) {
		Hai731 hai = new Hai731();
		hai.a = 99;
		Hello731 h = new Hello731();
		System.out.println("main beg :"+hai.a);
		h.m1(hai);
		System.out.println("main end :"+hai.a);
	}
}

class Hello731{
	void m1(Hai731 hai){
		System.out.println("m1 beg :"+hai.a);
		hai.a = hai.a+10;
		System.out.println("m1 end :"+hai.a);
	}
}

class Hai731{
	int a;
}
