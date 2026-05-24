package src.com.jlc.test;

class HaiThread implements Runnable{
	
	public HaiThread(){
		Thread t1=new Thread(this);
		t1.start();
	}
	
	public HaiThread(String tname){
		Thread t2=new Thread(this,tname);
		t2.start();
	}
	
	public HaiThread(String tname,ThreadGroup tg){
		Thread t3=new Thread(tg,this,tname);
		t3.start();
	}
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"--Under the ThreadGroup of"+Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}


public class Test115 {
	public static void main(String[] args) {

		ThreadGroup tg1=new ThreadGroup("tg1-jlc");
		new HaiThread();
		new HaiThread("th-jlc1");
		new HaiThread("th-jlc2",tg1);
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"--Under the ThreadGroup of"+Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
