package com.test;

class Hellop{
	int a=10;
	enum Month{
		JAN,FEB,MARCH,APRIL
	}
	
	void m1(){
		System.out.println("m1 in Hello");
		
		Month m[]=Month.values();
		
		for (Month month : m) {
			System.out.println(month+"--------"+month.ordinal());
		}
	}
}


public class Test119 {

	public static void main(String[] args) {
		
		Hellop h=new Hellop();
		h.m1();
		System.out.println(Hellop.Month.APRIL);
	}

}
