package com.java15;

public class Lab945 {
	public static void main(String[] args) {
		new B945().show();
	}
}

interface Inter94501{
	void show();
}

class A945{
	public void show(){
		System.out.println("A945 -> show()");
	}
}

class B945 extends A945 implements Inter94501{
	
}
