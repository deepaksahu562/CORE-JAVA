package com.pro;

public class Pro104 {

	public static void main(String[] args) {

		Test104 t1=new Test104();
		t1.start();
		//t1.start();
		Test401 t2=new Test401();
		//t2.start();	
	}
}
class Test104 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
class Test401 implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}