package src.com.jlc2015;

public class Lab1297 {

	public static void main(String[] args) {
		
		MyThread1297 mth1 = new MyThread1297("MyThread~1");
		MyThread1297 mth2 = new MyThread1297("MyThread~2");
		mth1.start(); mth2.start();
		//mth1.run();
		
		
		/*SelfThread1297 sth1 = new SelfThread1297();
		SelfThread1297 sth2 = new SelfThread1297();
		Thread th1 = new Thread(sth1, "SelfThread~1");
		Thread th2 = new Thread(sth2, "SelfThread~2");
		th1.start(); th2.start();*/
		
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

class MyThread1297 extends Thread{
	
	public MyThread1297(String tm) {
		super(tm);
	}
	
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

class SelfThread1297 implements Runnable{
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
