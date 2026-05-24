package com.jlc2015;

import java.util.ArrayList;

public class Lab1315_1 {

	public static void main(String[] args) {
		Hello1315_1 h1 = new Hello1315_1();
		Hello1315_1 h2 = new Hello1315_1();

		MyyThread1315_1 th1 = new MyyThread1315_1(h1);
		MyyThread1315_2 th2 = new MyyThread1315_2(h1);
		//MyyThread1315_2 th2 = new MyyThread1315_2(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1315_1 extends Thread {
	Hello1315_1 h = null;

	public MyyThread1315_1(Hello1315_1 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.m1();
	}
}

class MyyThread1315_2 extends Thread {
	Hello1315_1 h = null;

	public MyyThread1315_2(Hello1315_1 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.m2();
	}
}

class Hello1315_1 {
	synchronized void m1() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + " - m1() :" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	void m2() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + " - m2() :" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
 