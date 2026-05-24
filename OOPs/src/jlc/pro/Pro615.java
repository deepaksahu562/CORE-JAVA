package jlc.pro;

public class Pro615 {

	public static void main(String[] args) {
		System.out.println(B615.x);
	}
}

abstract class A615{
	static int x = 99;
	A615(){System.out.println("A -> DC");}
	static{System.out.println("A -> SB");}
}

class B615 extends A615{
	static{System.out.println("B -> SB");}
}