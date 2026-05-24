package src.com.java15;

public class Lab916 {

	public static void main(String[] args) {
		A916 obj = new B916();
		System.out.println(obj.a);
		
		B916 obj1 = new B916();
		System.out.println(obj1.a);
		
		A916 obj2 = new A916();
		System.out.println(obj2.a);
	}
}

class A916{
	int a = 102;
}

class B916 extends A916{
	String a = "India";
}
