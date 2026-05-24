package jlc.pro;

public class Pro102 {

	public static void main(String[] args) {
		System.out.println("Main :"+Hello102.a);
	}
}

class Hello102{
	final static int a = 10;
	static{
		//a = 20;
		System.out.println("SIB :"+a);
	}
}
