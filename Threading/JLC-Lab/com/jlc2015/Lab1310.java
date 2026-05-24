package src.com.jlc2015;

public class Lab1310 {

	public static void main(String[] args) throws Exception{
		MyThread1310 t1 = new MyThread1310();
		System.out.println(t1.getState());
		t1.start();
		Thread.sleep(500);
		System.out.println(t1.getState());
		Thread.sleep(5000);
		System.out.println(t1.getState());
	}
}

class MyThread1310 extends Thread{
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(th.getName()+" - value is "+i+"\t"+th.getState());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
