package src.com.jlc2015;

public class Lab1316 {

	public static void main(String[] args) {
		Hello1316 h1 = new Hello1316();
		Hello1316 h2 = new Hello1316();

		MyyThread1316 th1 = new MyyThread1316(h1);
		MyyThread1316 th2 = new MyyThread1316(h1);
		//MyyThread1316 th2 = new MyyThread1316(h2);

		th1.start();
		th2.start();
	}
}

class MyyThread1316 extends Thread {
	Hello1316 h = null;

	public MyyThread1316(Hello1316 h) {
		this.h = h;
	}

	@Override
	public void run() {
		h.show();
	}
}

class Hello1316 {
	synchronized void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + " - SHOW :" + i + "\t" + this);
			try {
				wait(100);
				//Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
