package src.com.jlc2015;

public class Lab1311 {

	public static void main(String[] args) {
		Account acc = new Account();
		new AccountThread(acc);
	}
}

class AccountThread implements Runnable{
	Account acc = null;
	public AccountThread(Account acc) {
		this.acc = acc;
		Thread th1 = new Thread(this,"AAAA");
		Thread th2 = new Thread(this,"BBBB");
		th1.start();
		th2.start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			if (acc.getBal()<255) {
				System.out.println("Amount is Overdrawn.....");
				break;
			}else {
				acc.withdraw(255);
			}
		}
	}
}

class Account {
	int bal = 970;
	
	public void withdraw(int amt){
		if (bal>=amt) {
			System.out.println(Thread.currentThread().getName()+"\tis going to withdraw...."+amt);
			try {
				Thread.sleep(1200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			bal-=amt;
			System.out.println(Thread.currentThread().getName()+"\tis completed withdraw....Now Balance is :"+bal);
		} else {
			System.out.println("No Funds for "+Thread.currentThread().getName());
		}
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
}