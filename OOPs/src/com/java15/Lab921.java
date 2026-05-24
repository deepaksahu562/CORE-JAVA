package com.java15;

public class Lab921 {

	public static void main(String[] args) {
		A921 aobj = new B921();
		//System.out.println(aobj.x);
		System.out.println(((B921)aobj).x);
	}
}

class A921{
	//int x = 100;
}
	
class B921 extends A921{
	String x = "India";
}
