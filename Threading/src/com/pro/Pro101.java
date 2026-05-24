package com.pro;

public class Pro101 {

	public static void main(String[] args) {
		/*MyThread mt=new MyThread();
		//mt.run();
		Thread t1=new Thread(mt);
		//t1.run();
		t1.start();
		*/
		
		SelfThread st=new SelfThread();
		Thread t2=new Thread(st);
		t2.start();
		t2.run();
				
		DeskThread dt=new DeskThread();
		Thread t3=new Thread(dt);
		t3.start();
		
		
		
		
	}
}
