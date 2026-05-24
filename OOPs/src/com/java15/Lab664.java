package com.java15;

public class Lab664 {

	public static void main(String[] args) {
		//System.out.println(new Hello664().a);
		System.out.println(Hello664.a);
	}
}


class Hello664{
	static final int a;
	
	/*{
		a = 90;
	}*/
	
	/*public Hello664() {
		a = 10;
	}*/
	
	static{
		
		//System.out.println(a);
		System.out.println(Hello664.a);
		a = 40;
	}
}