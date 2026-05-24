package com.jlc2015;

import java.util.ArrayList;

public class Lab1318 {

	public static void main(String[] args) {
		Hello1318 h1 = new Hello1318();
		Hello1318 h2 = new Hello1318();

		MyyThread1318 th1 = new MyyThread1318(h1);
		MyyThread1318 th2 = new MyyThread1318(h1);
		// MyyThread1316 th2 = new MyyThread1316(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1318 extends Thread {
	Hello1318 h = null;

	public MyyThread1318(Hello1318 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1318 {
	void show() {
		ArrayList al = new ArrayList<>();
		Thread th = Thread.currentThread();
		synchronized (al) {
			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " - SHOW :" + i + "\t" + this);
				try {
					al.wait(100);
					// Thread.sleep(200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
