package src.com.java15;

class A{
	static int X = 90;
}

class B extends A{
	void show(){
		System.out.println("B-> show()");
		System.out.println(X);
		X = 99;
	}
}
class C extends A{
	void display(){
		System.out.println("C-> display()");
		System.out.println(X);
	}
}
public class Lab943 {

	public static void main(String[] args) {
		B bobj = new B();
		bobj.show();
		C cobj = new C();
		cobj.display();
	}
}
