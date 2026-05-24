package com.jlc2015;

public class Test {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = str1 + str2;
		System.out.println(str3);
		
		Runtime r = Runtime.getRuntime();
		//r.runFinalization();
		
	}

}

class FooThread extends Thread{
	public void test(){
		notify();
	}
}
