package edu.ivq;

public class LNT1 {

	public static void main(String[] args) {
		//System.out.println(SubLNT1.a);
		//System.out.println(new SubLNT1().a);
		
		//SubLNT1.print();
		new SubLNT1().print();
	}
}

class SuperLNT1{
	static int a = 40;
	
	static {
		System.out.println("Satic Block SuperLNT1");
	}
	static void print(){
		System.out.println("SuperLNT1 - static-print");
	}
	
	public SuperLNT1() {
		System.out.println("SuperLNT1 - Const");
	}
}

class SubLNT1 extends SuperLNT1{
	static int a = 44;
	
	static {
		System.out.println("Satic Block SubLNT1");
	}
	
	public SubLNT1() {
		System.out.println("SubLNT1 - Const");
	}
	
	static void print(){
		System.out.println("SubLNT1 - static-print");
	}
}
