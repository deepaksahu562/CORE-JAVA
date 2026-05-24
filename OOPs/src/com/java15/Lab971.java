package src.com.java15;

public class Lab971 {

	public static void main(String[] args) {
		new Outer971().new Inner().show();
		new Outer971().check();
		//System.out.println(Outer971.this.a);
		
	}
}

class Outer971{
	int a = 11;
	
	void check(){
		System.out.println("Outer - check");
		System.out.println(Outer971.this.a);
	}
	class Inner{
		int a = 22;
		void show(){
			System.out.println("Inner - show");
			int a = 33;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Inner.this.a);
			System.out.println(Outer971.this.a);
			
			Outer971 outer = new Outer971();
			outer.check();
			//new Outer971().new Inner().show();
		}
	}
}