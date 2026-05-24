package edu.javatpoint;

public class DeadLock {

	public static void main(String[] args) {
		Resorce r1 = new Resorce();
		Resorce r2 = new Resorce();
		
		OwnThread1 t1 = new OwnThread1(r1, r2);
		OwnThread2 t2 = new OwnThread2(r1, r2);
		
		t1.start();
		t2.start();
	}
}

class Resorce{}

class OwnThread1 extends Thread{
	Resorce r1;
	Resorce r2;
	public OwnThread1(Resorce r1, Resorce r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	@Override
	public void run() {
		synchronized (r1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (r2) {}
		}
	}
}

class OwnThread2 extends Thread{
	Resorce r1;
	Resorce r2;
	public OwnThread2(Resorce r1, Resorce r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	@Override
	public void run() {
		synchronized (r2) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (r1) {}
		}
	}
}