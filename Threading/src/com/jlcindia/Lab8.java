package src.com.jlcindia;

/*

class A extends Thread{
	A(ThreadGroup tg){
		super(tg, "A");
		start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("by"+Thread.currentThread().getName()+"under group-"+Thread.currentThread().getThreadGroup().getName());
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

class B extends Thread{
	B(ThreadGroup tg){
		super(tg, "B");
		start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("by"+Thread.currentThread().getName()+"under group-"+Thread.currentThread().getThreadGroup().getName());
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
	
	
public class Lab8 {	
	public static void main(String[] args) {
		
		ThreadGroup tg1=new ThreadGroup("JLC1");
		ThreadGroup tg2=new ThreadGroup("JLC2");
		new A(tg1);
		new B(tg2);
	}
}
*/