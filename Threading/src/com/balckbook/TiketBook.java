package src.com.balckbook;

public class TiketBook{
	public static void main(String[] args) {
		Reserve res = new Reserve(1);
		Thread th1 = new Thread(res,"Parson-A");
		Thread th2 = new Thread(res,"Parson-B");
		th1.start();
		th2.start();
	}
}

class Reserve implements Runnable {
	
	int avilable = 1;
	int wanted = 0;
	
	public Reserve(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		new FinalTiket().tiketFinal(this);
	}
}

class FinalTiket{
	void tiketFinal(Reserve res){
		synchronized (Reserve.class) { //synchronized (res) {
			
		Thread th = Thread.currentThread();
		if(res.avilable>=1){
			System.out.println("Seat avilale for "+th.getName()+" : "+res.avilable);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			res.avilable--;
		}else {
			System.out.println("Sorry seat not avilable");
		}
		}
	}
}