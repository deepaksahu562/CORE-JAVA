package src.com.test;

public class Test89
{
	public static void main(String args[])
	{
		System.out.println("main in Test89");

		Hai hai1=new Hai(111);
		System.out.println(hai1.a);
		
		Hello h1=new Hello(22,hai1);
		System.out.println(h1.b+"\t"+h1.hai);
		
		Hello h2=h1.myClone();
		System.out.println(h2.b+"\t"+h2.hai);
		
		System.out.println(h1==h2);
		System.out.println(h1.hai == h2.hai);
		
		System.out.println("---------");
		
		Hello h3=h1;
		System.out.println(h1==h3);
		System.out.println(h1.hai == h3.hai);
		System.out.println(h3.b+"\t"+h3.hai);
		
		h1.show();
		h2.show();
		h3.show();
		
		System.out.println("***********");
		
		h1.show();
		h2.show();
		h1.b=500;
		h1.hai.a=600;
		h1.show();
		h2.show();
		System.out.println(h2.hai.a);
		System.out.println("++++++++");
		h2.b=999;
		h2.hai.a=888;
		h1.show();
		h2.show();
		
		h1.hai.a=101;
		h2.hai.a=202;
		h3.hai.a=303;
		System.out.println(h1.hai.a);
		System.out.println(h2.hai.a);
		System.out.println(h3.hai.a);
		
	}
}