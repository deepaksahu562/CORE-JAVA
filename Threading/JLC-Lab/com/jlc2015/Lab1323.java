package com.jlc2015;

public class Lab1323 {

	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		MyThread1323 th2 = new MyThread1323(th1);
		//th2.setPriority(Thread.MAX_PRIORITY);
		th2.start();
		
		for (char ch = 'A'; ch<'L'; ch++) {
			System.out.println(th1.getName() + "\t" + ch + "\t M :" + th1.isAlive()
					+ ", TH :" + th2.isAlive() + ", C :" + Thread.activeCount());
			//if (ch=='C') {	int x = 10/0;}
			try {
				//if (ch=='C') {	th2.join();}
				//if (ch=='C') {	Thread.yield();}
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main -Complated");
	}
}

class MyThread1323 extends Thread {
	Thread main;

	public MyThread1323(Thread main) {
		this.main = main;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "\t" + i + "\t M :" + main.isAlive()
					+ ", TH :" + isAlive() + ", C :" + Thread.activeCount());
			//if (i==5) {	int x = 10/0;}
			try {
				if (i==5) {	main.join();} //DeadLock
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread -Complated");
	}
}
