package src.com.jlc2015;

import java.util.ArrayList;

public class Lab1313 {

	public static void main(String[] args) {
		Hello1313 h1 = new Hello1313();
		Hello1313 h2 = new Hello1313();

		MyyThread1313 th1 = new MyyThread1313(h1);
		MyyThread1313 th2 = new MyyThread1313(h1);
		//MyyThread1313 th2 = new MyyThread1313(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1313 extends Thread {
	Hello1313 h = null;

	public MyyThread1313(Hello1313 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1313 {
	void show() {
		Thread th = Thread.currentThread();
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " - SHOW :" + i + "\t" + this);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
