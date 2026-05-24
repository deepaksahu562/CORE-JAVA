package enums;

enum DAY{
	SUN,MON,TUE;
	
	void m1(){
		System.out.println("m1() in DAY");
	}
	static void m2(){
		System.out.println("m2() in DAY");
	}
}

class Hellos{
	void show(){
		System.out.println("show() in Hellos");
		//DAY.m1();
		DAY.SUN.m1();
		DAY.m2();
		System.out.println(DAY.SUN);
	}
}



public class Test120 {

	public static void main(String[] args) {
		Hellos h=new Hellos();
		h.show();
	}

}
