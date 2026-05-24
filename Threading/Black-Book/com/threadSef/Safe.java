package com.threadSef;
class Reserve implements Runnable
{
	int available=1;
	int wanted;
	Object obj=new Object();
	
	Reserve(int i)	
	{
		wanted=i;
	}

	public void run()
	{		
		//synchronized (this) 
		synchronized(obj)
		{
			System.out.println("Availeble setes : "+available);

			if(available>=wanted)
			{
				String name=Thread.currentThread().getName();
				System.out.println(wanted+" :seet is Reserved the :"+name);
				try
				{
					Thread.sleep(1500);
					available=available-wanted;
				}
				catch(Exception e){}
			}
			else
				System.out.println("No sites availabel");
		}
	}
}
class Safe
{
	public static void main(String args[])
	{
		Reserve obj=new Reserve(1);

		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);

		t1.setName("First person");
		t2.setName("Second person");
		
		t1.start();
		t2.start();
	}
}