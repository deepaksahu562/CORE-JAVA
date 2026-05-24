package src.com.java15;

public class Lab798 {

	public static void main(String[] args) {
		
		//System.out.println(Hai798.a);
		System.out.println(Hello798.a);
	}
}

class Hai798{
	static int a = 99;
	static{
		System.out.println("Hai -> S.B.");
	}
}

class Hello798 extends Hai798{
	//static int a = 99;
	static{
		System.out.println("Hello -> S.B.");
	}
}
