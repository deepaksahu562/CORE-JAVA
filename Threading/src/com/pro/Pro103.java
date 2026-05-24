package com.pro;

public class Pro103 {

	public static void main(String[] args) {
		/*
		Temp temp1=new Temp();
		Temp temp2=new Temp();
		
		Thread t1=new Thread(temp1,"Ist Thread");
		Thread t2=new Thread(temp2,"2nd Thread");
		
		t1.start();
		t2.start();
		*/
		
		
		Test test1=new Test();
		Test test2=new Test();
		test1.setPriority(9);
		test1.start();
		test2.start();
		
	}
}
class Test extends Thread{
	public static synchronized void show(Thread th){
		System.out.println(th.getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
		show(Thread.currentThread());
	}

}

class Temp implements Runnable{
	
	public static synchronized void show(Thread th){
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void run() {
			show(Thread.currentThread());
	}
}