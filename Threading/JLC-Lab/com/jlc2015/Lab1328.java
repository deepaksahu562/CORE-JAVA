package src.com.jlc2015;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab1328 {

	public static void main(String[] args) {
		MyThread1328 th = new MyThread1328();
		ExecutorService ser = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 3; i++) {
			ser.execute(th);
		}
	}
}


class MyThread1328 implements Runnable{
	@Override
	public synchronized void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName()+"\t"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Task completed");
	}
}