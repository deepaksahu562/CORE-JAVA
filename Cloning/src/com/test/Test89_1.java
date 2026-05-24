package src.com.test;
/*
class Hai
{
	int a;
	Hai(int a)
	{
		this.a=a;
	}
}
class Hello implements Cloneable
{
	int b;
	Hai hai;

	Hello(int b,Hai hai)
	{
		this.b=b;
		this.hai=hai;
	}

	Hello myClone()
	{
		Hello h1=null;
		
		try{
			h1=(Hello)this.clone();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return h1;
	}

	void show()
	{
		System.out.println("show in Hello");
		System.out.println(b);
		System.out.println(hai.a);
	}
}

public class Test89_1
{
	public static void main(String args[])
	{
		Hai hai1=new Hai(111);
		Hello h1=new Hello(22,hai1);
		//Hello h2=(Hello)h1.clone();
		Hello h2=h1.myClone();
		System.out.println(h1==h2);
		System.out.println(h1.hai==h2.hai);

		h1.show();
		h2.show();
		System.out.println("********");
		h1.b=500;
		h1.hai.a=600;
		h1.show();
		h2.show();

		h2.b=999;
		h2.hai.a=888;
		h1.show();
		h2.show();
	}
}*/