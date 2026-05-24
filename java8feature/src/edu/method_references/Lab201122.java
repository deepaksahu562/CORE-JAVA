package edu.method_references;

import java.util.function.BiFunction;

interface Sayable201122 {
	void say();
}

class Arithmetic201122 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}
}

public class Lab201122 {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {

		// Referring static method
		Sayable201122 sayable1 = Lab201122::saySomething;
		sayable1.say();

		/* Runnable runnale = Lab201122::ThreadStatus; 
		   Thread th = new Thread(runnale); */
		Thread th = new Thread(Lab201122::ThreadStatus);
		th.start();

		BiFunction<Integer, Integer, Integer> adder1 = Arithmetic201122::add;
		BiFunction<Integer, Float, Float> adder2 = Arithmetic201122::add;

		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);

		System.out.println(result1);
		System.out.println(result2);
	}
}
