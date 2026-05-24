package com.jlc2015;

public class Lab1296 {

	public static void main(String[] args) {
		
		/*MyThread mth1 = new MyThread();
		MyThread mth2 = new MyThread();
		mth1.start(); mth2.start();
		//mth1.run();
		*/
		
		SelfThread sth1 = new SelfThread();
		SelfThread sth2 = new SelfThread();
		Thread th1 = new Thread(sth1);
		Thread th2 = new Thread(sth2);
		th1.start(); th2.start();
		
		Thread th = Thread.currentThread();
		th.setPriority(8);
		
		for (int i = 0; i <=5; i++) {
			System.out.println("Thread Name/id : "+th.getName()+"/"+th.getId()+"\t\t\t Priority : "+th.getPriority()+"\tValue : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i <=5; i++) {
			System.out.println("Thread Name/id : "+th.getName()+"/"+th.getId()+"\t\t Priority : "+th.getPriority()+"\tValue : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class SelfThread implements Runnable{
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i <=5; i++) {
			System.out.println("Thread Name/id : "+th.getName()+"/"+th.getId()+"\t Priority : "+th.getPriority()+"\tValue : "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
