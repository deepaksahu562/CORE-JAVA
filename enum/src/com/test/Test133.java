package src.com.test;

class Hai11{
}
class Hai12 extends Hai11{
}

class Hello12{
	void m1(){
		System.out.println("m1()");
	}
	void m1(int a){
		System.out.println("m1(int)");
	}
	void m1(Object o){
		System.out.println("m1(Object)");
	}
	void m1(String str){
		System.out.println("string");
	}
	void m1(Hai12 hai1){
		System.out.println("Hai1");
	}
}

public class Test133 {

	public static void main(String[] args) {

		Hello12 h1=new Hello12();
		h1.m1();
		h1.m1(111);
		//h1.m1(null);
	}

}
