package src.com.jlc.test;
class HelloThread extends Thread
{
	public HelloThread()
	{
		super();
		System.out.println("DC in HelloThread");
		start();
	}

	HelloThread(String tname)
	{
		super(tname);
		start();
	}

	HelloThread(String tname,ThreadGroup tg,int i)
	{
		super(tg,tname);
		setPriority(i);
		start();
	}

	public void run()
	{
		for(int i=0;i<3;i++)
		{	
			System.out.println("Thread Name :"+Thread.currentThread().getName()+"  under the ThreadGroup of :"+Thread.currentThread().getThreadGroup().getName()+"--Priority : "+Thread.currentThread().getPriority());

			try{
				Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

public class Test114
{
	public static void main(String args[])
	{
		ThreadGroup tg=new ThreadGroup("TG-JLC:1:");
		
		HelloThread ht=new HelloThread();
		
		System.out.println(ht);
		
		new HelloThread("jlc-1");
		new HelloThread("jlc-2",tg,4);
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{	
			System.out.println("Thread Name :"+Thread.currentThread().getName()+"  under the ThreadGroup of :"+Thread.currentThread().getThreadGroup().getName()+"----Priority : "+Thread.currentThread().getPriority());

			try{
				Thread.sleep(200);
			}catch(Exception e){
				e.printStackTrace();
			}
		}		
		}
	}
}