package edu.ivq.test;
// v v IMP
public class Test3 {
	
	public static void main(String[] args) {
		A a = new B();
		a.dispaly();
		System.out.println(a.i);
	}
}


class A{
	 int i =10;
	 public void dispaly(){
			System.out.println("Hello");
	 }
}

class B extends A{
	int i =20;
	 public void dispaly(){
			System.out.println("Hai");
	 }
}