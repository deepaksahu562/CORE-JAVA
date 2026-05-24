package src.com.java15;

public class Lab730 {

	public static void main(String[] args) {
		int a =99;
		Hello730 h = new Hello730();
		System.out.println("main beg :"+a);
		h.m1(a);
		System.out.println("main end :"+a);
	}
}

class Hello730{
	void m1(int a){
		System.out.println("m1 beg :"+a);
		a = a+10;
		System.out.println("m1 end :"+a);
	}
}
