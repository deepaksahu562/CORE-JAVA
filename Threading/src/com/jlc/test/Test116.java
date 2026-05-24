package src.com.jlc.test;
class Hello
{
	synchronized void m1()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("m1() :"+Thread.currentThread().getName()+"  "+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
	}

	synchronized static void m2()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("m2() :"+Thread.currentThread().getName()+"  "+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
	}
	
}

class AThread implements Runnable
{
	String tname;
	Hello h1=null;
	public AThread(){}
	AThread(String tname,Hello h1)
	{
		this.h1=h1;
		Thread t1=new Thread(this,tname);
		t1.start();
	}
	public void run()
	{
		h1.m1();
	}
}

class BThread implements Runnable
{
	String tname;
	Hello h1=null;
	public BThread(){}
	BThread(String tname,Hello h1)
	{
		this.h1=h1;
		Thread t1=new Thread(this,tname);
		t1.start();
	}
	public void run()
	{
		h1.m2();
	}
}

public class Test116
{
	public static void main(String args[])
	{
		Hello h1=new Hello();
		//Hello h2=new Hello();
		
		new AThread("jlc-1",h1);
		
		new BThread("Jlc-2",h1);
	}
}