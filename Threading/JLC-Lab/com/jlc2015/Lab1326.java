package src.com.jlc2015;

public class Lab1326 {
	public static void main(String[] args) {
		UserThread ut1 = new UserThread("Deepak", "Sahu");
		UserThread ut2 = new UserThread("Vineeta", "DSahu");
		ut1.start();
		ut2.start();
	}
}

class UserThread extends Thread {
	service serv = new service();
	String uname;
	String pswd;

	public UserThread(String uname, String pswd) {
		this.uname = uname;
		this.pswd = pswd;
	}
	
	@Override
	public void run() {
		serv.verifyUser(uname, pswd);
	}
}

class service {
	void verifyUser(String uname, String pswd) {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {

			System.out.println(th.getName() + "\t Verifying:" + uname + " - " + pswd);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
