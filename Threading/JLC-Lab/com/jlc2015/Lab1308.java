package src.com.jlc2015;

public class Lab1308 {

	public static void main(String[] args) {
		Mythread1308 th = new Mythread1308();
		th.setPriority(1);
		System.out.println(th);
		th.setName("Hello");
		th.setPriority(10);
		System.out.println(th.getName());
		System.out.println(th.getThreadGroup().getName());
		System.out.println(th.getPriority());
		System.out.println(th);

	}
}

class Mythread1308 extends Thread{
	
}
