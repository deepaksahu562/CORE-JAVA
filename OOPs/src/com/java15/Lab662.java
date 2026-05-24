package com.java15;

public class Lab662 {

	public static void main(String[] args) {
		Hello662 h = new Hello662();
		System.out.println(h.a);
	}

}

class Hello662 {
	
	final int a;
	Hello662() {
		a = 10;
	}
	
	Hello662(int a) {
		this.a = a;
	}
	 
	{
		//a = 90;
	}
	
}
