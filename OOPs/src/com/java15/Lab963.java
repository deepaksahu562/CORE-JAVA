package src.com.java15;

public class Lab963 {

	public static void main(String[] args) {
		new Outer963().show();
	}
}

class Outer963{
	
	void show(){
		System.out.println("Outer - show");
		Inner inner = new Inner();
		System.out.println(inner.x);
		inner.m1();
	}
	
	class Inner{
		int x = 11;
		void m1(){
			System.out.println("Inner - m1");
		}
	}
}
