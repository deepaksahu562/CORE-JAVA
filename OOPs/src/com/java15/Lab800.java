package src.com.java15;

public class Lab800 {

	public static void main(String[] args) {
		new Hello800();
	}
}

class Hai800{
	int a = 99;
	{
		System.out.println("Hai IB :"+a);
	}
}

class Hello800 extends Hai800{
	int b = 88;
	{
		System.out.println("Hello IB :"+a);
		System.out.println("Hello IB :"+b);
	}
}
