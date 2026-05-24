package com.pro;

public class Pro102 {

	public static void main(String[] args) {
		HelloThread ht=new HelloThread();
		ht.run();
		//ht.start();
		System.out.println("--------");
		Thread t1=new Thread(ht);
		t1.start();
		t1.run();

	}

}
