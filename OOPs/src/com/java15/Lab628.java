package src.com.java15;

public class Lab628 {

	public static void main(String[] args) {
		//System.out.println(Hello628.b);
		System.out.println(new Hello628().a);
		
	}
}

class Hello628{
	/*static{
		b = 10;
		System.out.println(b);
	}
	static int b = 20;
	static{
		System.out.println(b);
	}*/
	
	{
		a = 40;
		System.out.println(this.a);
		//System.out.println(Hello628.a);
	}
	
	int a = 50;
	{
		System.out.println(a);
	}
}