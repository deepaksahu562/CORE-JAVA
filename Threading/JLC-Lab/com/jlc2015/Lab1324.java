package com.jlc2015;

public class Lab1324 {

	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		MyThread1324 th2 = new MyThread1324(th1);
		th2.start();
		for (char ch = 'A'; ch<'L'; ch++) {
			System.out.println(th1.getName() + "\t" + ch + "\t M :" + th1.isAlive()
					+ ", TH :" + th2.isAlive() + ", C :" +" is-Daemon : "+th1.isDaemon());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main -Complated");
	}
}

class MyThread1324 extends Thread {
	Thread main;

	public MyThread1324(Thread main) {
		this.main = main;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "\t" + i + "\t M :" + main.isAlive()
					+ ", TH :" + isAlive() + ", C :" +" is-Daemon : "+isDaemon());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread -Complated");
	}
}
