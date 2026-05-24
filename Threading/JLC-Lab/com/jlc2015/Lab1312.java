package com.jlc2015;

import java.util.ArrayList;

public class Lab1312 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();

		MyyThread th1 = new MyyThread(h1);
		MyyThread th2 = new MyyThread(h1);
		//MyyThread th2 = new MyyThread(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread extends Thread {
	Hello h = null;

	public MyyThread(Hello h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello {
	 void show() {
		Thread th = Thread.currentThread();
		//synchronized (Hello.class) {
			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " - SHOW :" + i + "\t" + this);
				try {
					Thread.sleep(500);
					//wait(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		//}
	}
}
