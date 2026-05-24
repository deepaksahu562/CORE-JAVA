package src.edu.inv;

public class Inv109 {

	public static int count = 1;

	public static void main(String[] args) {
		Inv109 inv = new Inv109();
		Thread evenThread = new Thread(new EvenThread(inv));
		Thread oddThread = new Thread(new OddThread(inv));
		evenThread.start();
		oddThread.start();
	}

}

class EvenThread implements Runnable {
	
	Inv109 inv;
	EvenThread(Inv109 inv){
		this.inv = inv;
		
	}

	@Override
	public void run() {

		

		try {

			synchronized (inv) {
				for (int i = 0; i <= 5; i++) {
					System.out.println(inv.count);
					inv.count++;
					Thread.sleep(500);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class OddThread implements Runnable {
	
	Inv109 inv;
	OddThread(Inv109 inv){
		this.inv = inv;
		
	}

	@Override
	public void run() {

		try {

			synchronized (inv) {
				for (int i = 0; i <= 5; i++) {
					System.out.println(inv.count);
					inv.count++;
					Thread.sleep(500);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
