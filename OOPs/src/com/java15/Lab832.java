package com.java15;

public class Lab832 {

	public static void main(String[] args) {
		new B832();
	}
}

class A832{
	
	{
		System.out.println("******");
	}
	A832(Object obj){
		System.out.println("A832(Object obj)");
	}
	{
		System.out.println("&&&&&&&&");
	}
	
	A832(){}
}

class B832 extends A832{

	B832() {
		//super(this);				//Not OK
		//this(this);				//Not OK
		//super(new Object());		//OK
		super(new B832());			//OK
		System.out.println("B832() const");
	}
	
	B832(Object obj) {
		System.out.println("B832(Object obj) const");
	}
	
}
