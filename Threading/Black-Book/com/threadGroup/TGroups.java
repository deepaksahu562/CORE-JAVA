package src.com.threadGroup;
class TGroups
{
	public static void main(String args[])
	{
		Reservation res=new Reservation();
		Cancellation can=new Cancellation();

		ThreadGroup tg=new ThreadGroup("First Group");

		Thread t1=new Thread(tg,res,"First Thread");
		Thread t2=new Thread(tg,res,"Second Thread");

		ThreadGroup tg1=new ThreadGroup("Second Group");

		Thread t3=new Thread(tg,can,"Third Thread");
		Thread t4=new Thread(tg,can,"Fourth Thread");

		System.out.println("Parent of tg1 :"+tg.getParent());		

		System.out.println("Thread Group of t1 :"+t1.getThreadGroup().getName());
		System.out.println("Thread Group of t3 :"+t3.getThreadGroup().getName());

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("No of threads active in tg="+tg.activeCount());
		
	}
}

class Reservation extends Thread
{
	public void run()
	{
		System.out.println("Reservation Thread");
	}
}
class Cancellation extends Thread
{
	public void run()
	{
		System.out.println("Cancellation Thread");
	}
}