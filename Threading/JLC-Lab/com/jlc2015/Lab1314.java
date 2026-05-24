package com.jlc2015;

public class Lab1314 {

	public static void main(String[] args) {
		Hello1314 h1 = new Hello1314 ();
		Hello1314 h2 = new Hello1314 ();

		MyyThread1314 th1 = new MyyThread1314(h1);
		//MyyThread1314 th2 = new MyyThread1314(h1);
		MyyThread1314  th2 = new MyyThread1314(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1314  extends Thread {
	Hello1314 h = null;

	public MyyThread1314 (Hello1314 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1314  {
	synchronized static void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " - SHOW :" + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
}
