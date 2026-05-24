package jlc.pro;

public class Pro617 {

	public static void main(String[] args) {
		new B617().m1();
		System.out.println(C617.x);
	}
}

abstract class A617{
	static int x = 99;
	void m1(){}
}

class B617 extends A617{
	public B617() {
		x = 80;
	}
	void m1(){System.out.println("B -> m1()");}
}

class C617 extends A617{}