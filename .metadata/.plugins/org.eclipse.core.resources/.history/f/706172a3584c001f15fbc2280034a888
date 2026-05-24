package edu.method_references;

import java.util.function.BiFunction;

interface Sayable201123 {
	void say();
}

class Arithmetic201123 {
	public int add(int a, int b) {
		return a + b;
	}
}

public class Lab201123 {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		
		Lab201123 methodReference = new Lab201123();
		// Referring non-static method using reference
		Sayable201123 sayable1 = methodReference::saySomething;
		// Calling interface method
		sayable1.say();

		Sayable201123 sayable2 = new Lab201123()::saySomething;
		sayable2.say();

		Thread th = new Thread(new Lab201123()::printnMsg);
		th.start();
		
		BiFunction<Integer, Integer, Integer>adder = new Arithmetic201123()::add;  
		int result = adder.apply(10, 20);  
		System.out.println(result);  
	}
}
