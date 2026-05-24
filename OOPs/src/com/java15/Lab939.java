package com.java15;

public class Lab939 {

	public static void main(String[] args) {
		Hello939 h = new Hello939();
		h.m1(); h.m2(); h.m3();
	}
}

interface Inter93901{
	int A = 10;
	int B = 20;
	void m1();
	void m2();
}

abstract interface Inter93902{
	int A = 11;
	int C = 30;
	void m2();
	void m3();
}

class Hello939 implements Inter93901, Inter93902{
	@Override
	public void m3() {
		System.out.println("Hello -> m3()");
		System.out.println(B);
		System.out.println(C);
		//System.out.println(A);
		System.out.println(Inter93901.A);
		System.out.println(Inter93902.A);
	}
	@Override
	public void m1() {
		System.out.println("Hello -> m1()");
	}
	@Override
	public void m2() {
		System.out.println("Hello -> m2()");
	}
}

