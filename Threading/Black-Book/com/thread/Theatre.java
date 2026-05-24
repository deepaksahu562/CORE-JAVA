package com.thread;
class MyThread implements Runnable
{
	String str;
	MyThread(String str)
	{
		System.out.println("DC in MyThread");
		this.str=str;
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(str+" : "+i);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Theatre
{
	public static void main(String args[])
	{
		MyThread obj1=new MyThread("Cut the ticket");
		MyThread obj2=new MyThread("Show the seet");

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		
		t1.start();
		t2.start();
	}
}