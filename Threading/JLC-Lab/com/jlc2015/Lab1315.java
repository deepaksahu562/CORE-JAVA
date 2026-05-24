package src.com.jlc2015;

import java.util.ArrayList;

public class Lab1315 {

	public static void main(String[] args) {
		Hello1315 h1 = new Hello1315();
		Hello1315 h2 = new Hello1315();

		MyyThread1315 th1 = new MyyThread1315(h1);
		//MyyThread1315 th2 = new MyyThread1315(h1);
		MyyThread1315 th2 = new MyyThread1315(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1315 extends Thread {
	Hello1315 h = null;

	public MyyThread1315(Hello1315 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1315 {
	static void show() {
		Thread th = Thread.currentThread();
		synchronized (Hello1315.class) {
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
}
