package com.java15;

public class Lab727 {

	public static void main(String[] args) {

		int x = 98;
		System.out.println("Main begins :"+x);
		new Hello727().m1(x);
		System.out.println("Main ends :"+x);
	}
}


class Hello727{
	void m1(int x){
		System.out.println("m1 begins :"+x);
		if(x!=0)
			m1(x/10);
		System.out.println("m1 ends :"+x);
	}
}