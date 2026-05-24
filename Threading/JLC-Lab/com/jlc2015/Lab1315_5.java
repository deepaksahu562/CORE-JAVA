package com.jlc2015;

import java.util.ArrayList;

public class Lab1315_5 {

	public static void main(String[] args) {
		Hello1315_5 h1 = new Hello1315_5 ();
		Hello1315_5 h2 = new Hello1315_5 ();

		MyyThread1315_5 th1 = new MyyThread1315_5(h1);
		MyyThread1315_5 th2 = new MyyThread1315_5(h1);
		// MyyThread1315_5  th2 = new MyyThread1315_5(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1315_5  extends Thread {
	Hello1315_5 h = null;

	public MyyThread1315_5 (Hello1315_5 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1315_5  {
 	synchronized void show() {
		Thread th = Thread.currentThread();
		ArrayList al = new ArrayList();
		synchronized (al) {
			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + " - SHOW :" + i + "\t"+ this.hashCode());
				try {
					//Thread.sleep(200);
					al.wait(200);
					//wait(200);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//System.out.println(th.getName() + " - SHOW -:" + i + "\t"+ Hello.class.hashCode());
			}
		}
	}
}
