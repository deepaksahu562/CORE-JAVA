package src.com.java15;

public class Lab626 {

	public static void main(String[] args) {
		System.out.println(Hello626.b);
		//System.out.println(new Hello626().a);
	}
}

class Hello626{
	//static int b = 90;
	static{
		System.out.println(Hello626.b);
		b = 10;
		//Hello626.b = 20;
		//System.out.println(b);
		System.out.println(Hello626.b);
	}
	static int b = 90;
	
	
	
	/*int a = 100;
	{
		a = 70;
	}
	
	int a = 200;*/
}