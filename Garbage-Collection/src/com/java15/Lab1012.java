package src.com.java15;

public class Lab1012 {

	public static void main(String[] args) {
		new Hello1012().show();
		
		Hello1012 hello = new Hello1012();
		hello = null;
		
		Hello1012 hello1 = new Hello1012();
		Hello1012 hello2 = new Hello1012();
		
		hello1 = hello2;
		
		new Hello1012().m1();
		//System.runFinalization();
		//System.gc();
		System.runFinalizersOnExit(true);
		System.out.println("Hello-World..... !!");
	}
}


class Hello1012{
	void show(){
		System.out.println("Hello - show");
	}
	
	void m1(){
		System.out.println("m1 - strat");
		Hai1012 hai1 = new Hai1012();
		Hai1012 hai2 = new Hai1012();
		Hai1012 hai3 = new Hai1012();
		System.out.println("m1 - end");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hello - finalize");
	}
}

class Hai1012{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hai - finalize");
	}
}
