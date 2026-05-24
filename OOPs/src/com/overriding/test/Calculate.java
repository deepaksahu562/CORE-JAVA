package src.com.overriding.test;

public class Calculate {

	public static void main(String[] args) {

		A obj1=new A();
		obj1.calculate(2);
		
		B obj2=new B();
		obj2.calculate(2);
		
		A ref1=null;
		
		ref1=obj1;
		ref1.calculate(2);
		
		ref1=obj2;
		ref1.calculate(2);

	}

}
