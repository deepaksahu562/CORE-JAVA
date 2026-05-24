package src.com.pro;

public class MyThread extends Thread{
	
	MyThread(){
		run();
		start();
	}

	public void run() {
		for (int i = 0; i < 5;i++) {
			System.out.println(i);
		}
	}
}

class SelfThread extends MyThread{
	
	
	public SelfThread() {
		System.out.println("DC in SelfThread");
		run();
		start();
	}

	public void run() {
		//super.run();
		for (int i = 101; i < 105;i++) {
			//System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}

class DeskThread extends Thread{
	public void run() {
		System.out.println("run in DeskThread");
	}
}