package src.com.java15;

public class Lab638 {

	public static void main(String[] args) {
		Hello638 hello = new Hello638();
		System.out.println("Main :"+hello.a);
	}
}

class Hello638{
	{
		System.out.println("IB1 :"+this.a);
		//System.out.println("IB1 :"+Hello638.b);
	}
	int a = 20;
	static int b = 40;
	{
		System.out.println("IB2 :"+a);
		//System.out.println("IB2 :"+this.a);
	}
}
