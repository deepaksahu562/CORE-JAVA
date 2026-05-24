package com.jlc2015;

import java.util.ArrayList;

public class Lab1317 {

	public static void main(String[] args) {
		Hello1317 h1 = new Hello1317();
		Hello1317 h2 = new Hello1317();

		MyyThread1317 th1 = new MyyThread1317(h1);
		MyyThread1317 th2 = new MyyThread1317(h1);
		//MyyThread1316 th2 = new MyyThread1316(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1317 extends Thread {
	Hello1317 h = null;

	public MyyThread1317(Hello1317 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1317 {
	synchronized void show() {
		ArrayList al = new ArrayList<>();
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + " - SHOW :" + i + "\t" + this);
			try {
				al.wait(100);
				//Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
