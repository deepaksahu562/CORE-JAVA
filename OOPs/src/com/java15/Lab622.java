package com.java15;

public class Lab622 {

	public static void main(String[] args) {
		Hello622 hello = new Hello622();
		hello.show();
	}

}

class Hello622{
	int a = 6;
	void show(){
		String a = "jlc";
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(Hello622.this.a);
		Hello622.this.display();
	}
	
	void display(){
		System.out.println("display");
	}
}
