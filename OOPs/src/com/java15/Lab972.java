package src.com.java15;

public class Lab972 {

	public static void main(String[] args) {
		new Outer972().new Inner().showInner();
		new Outer972().showOuter();
	}
}


class Outer972{
	
	private int a = 10;
	
	class Inner{
		
		private int a = 20;
		
		void showInner(){
			System.out.println("Inner - showInner");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Outer972.this.a);
			System.out.println(new Outer972().a);
		}
	}
	
	void showOuter(){
		System.out.println("Outer - showOuter");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(new Inner().a);
		System.out.println(Outer972.this.a);
		System.out.println(new Outer972().a);
	}
}