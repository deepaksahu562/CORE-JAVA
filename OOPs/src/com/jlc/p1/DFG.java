package com.jlc.p1;


public class DFG{
	
	int a = 10;
	static int b = 20;
	{
		System.out.println(a);
	}
	static{
		System.out.println(b);
	}
	public void funct() {
		System.out.println(a+b);
	}
	
	public DFG() {
		System.out.println("DC-DFG");
	}
}
