package src.com.java15;

public class Lab1009 {

	public static void main(String[] args)throws CloneNotSupportedException {
		Hai hai = new Hai(10);
		Hello h1 = new Hello(20, hai);
		Hello h2 = (Hello) h1.clone();
		//Hello h2 =  h1;
		
		h1.show();
		h2.show();

		System.out.println("------1------");
		System.out.println(h1==h2);
		System.out.println(h1.hai==h2.hai);
		
		h2.y = 30;
		//h2.hai.x = 555;
		System.out.println("------2------");
		h1.show();
		h2.show();

		h2.hai.x = 111;
		//h1.hai.x = 222	;
		System.out.println("------3------");
		h1.show();
		h2.show();

	}
}

class Hai{
	int x;
	public Hai(int x) {
		this.x = x;
	}
}
class Hello implements Cloneable{
	int y;
	Hai hai;
	public Hello(int y, Hai hai) {
		this.y = y;
		this.hai = hai;
	}
	
	void show(){
		System.out.println("Hello : Y :"+y);
		System.out.println("Hai   : X :"+hai.x);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}