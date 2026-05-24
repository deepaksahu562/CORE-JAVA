package com.test;

class Hello1{
	
	{
		System.out.println("IB in Hello");
	}
	
	static{
		System.out.println("SB in Hello");
	}
	
	int i=10;
	static int j=20;
	
	void show(long a){
		System.out.println(a);
	}
	
}

public class Test {

	public static void main(String[] args) {

		Hello1 h1=new Hello1();
		//System.out.println(Hello1.j);
		//int a=10;
		double a=10.2;
		h1.show((long)a);

	}

}
