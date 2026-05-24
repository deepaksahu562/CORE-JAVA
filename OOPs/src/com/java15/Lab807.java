package src.com.java15;

public class Lab807 {

	public static void main(String[] args) {
		new C807().show();
		//new C807().check();
	}
}

class A807 {
	int a = 100;
	int l = 200;
	static{
		System.out.println("SIB A");
		
	}
	
	{
		System.out.println("IIB A");
		A807 a807 = this;
		System.out.println("a807 - "+a807);
	}
	
	A807() {
		System.out.println("DC-A");
	}
}

class B807 extends A807{
	int a = 10;
	static{
		System.out.println("SIB B");
	}
	
	{
		System.out.println("IIB B");
	}
	
	
	B807(int a) {
		System.out.println("DC-B");
	}
	void check(){
		System.out.println("check - B");
	}
}

class C807 extends B807{
	int a = 20;
	static{
		System.out.println("SIB C");
	}
	
	{
		System.out.println("IIB C");
	}
	
	C807() {
		super(20);
		//this(19);
		System.out.println("DC-C");
	}
	C807(int a) {
		super(19);
		System.out.println("DC-C");
	}
	
	/*void check(){
		System.out.println("check - C");
	}*/
	
	void show(){
		
		Bb b =new Bb();
		//b.super.a;
		
		System.out.println("C-a :"+a);
		System.out.println("B-a :"+super.a);
		super.check();
		//System.out.println(C807.this+" : "+C807.super);
		System.out.println(this.l);
		//System.out.println(supern.l);
	}
}
