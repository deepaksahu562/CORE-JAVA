package src.com.java15;

public class Lab733 {

	public static void main(String[] args) {
		Hai733 hai = new Hai733();
		hai.a = 99;
		Hello733 h = new Hello733();
		System.out.println("main beg :"+hai.a);
		h.m1(hai.a);
		System.out.println("main end :"+hai.a);
	}
}

class Hello733{
	void m1(int a){
		System.out.println("m1 beg :"+a);
		a = a+10;
		System.out.println("m1 end :"+a);
	}
}

class Hai733{
	int a;
}
