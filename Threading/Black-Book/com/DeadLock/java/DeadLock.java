package com.DeadLock.java;
class BookTicket extends Thread
{	
	//Object train,comp;

	Train train;
	Comp comp;	

	BookTicket(Train train,Comp comp)
	{
		this.train=train;
		this.comp=comp;
	}

	public void run()
	{
		synchronized(train)
		{
			System.out.println("BookTicket Locked train boj");
			try{
				Thread.sleep(1500);
			}catch(Exception e){}
			
			System.out.println("BookTicket waiting for comp obj....");
			synchronized(comp)
			{
				System.out.println("BookTicket is completed !");
			}
		}
	}
}


class CancelTicket extends Thread
{
	//Object train,comp;
	Train train;
	Comp comp;
	CancelTicket(Train train,Comp comp)
	{
		this.train=train;
		this.comp=comp;
	}

	public void run()
	{
		synchronized(comp)
		{
			System.out.println("CancelTicket Locked comp obj");
			try{
				Thread.sleep(1500);
			}catch(Exception e){}

			System.out.println("CancelTicket waiting for train boj....");

			synchronized(train)
			{
				System.out.println("CancelTicket is completed !");
			}
		}
	}
}

class DeadLock
{
	public static void main(String args[])throws Exception
	{
		Train train=new Train();
		Comp comp=new Comp();		


		BookTicket obj1=new BookTicket(train,comp);
		CancelTicket obj2=new CancelTicket(train,comp);
		
		obj1.start();
		obj2.start();
		
		//Thread t1=new Thread(obj1);
		//Thread t2=new Thread(obj2);
		//t1.start();
		//t2.start();
		
	}
}

class Train{}
class Comp{}