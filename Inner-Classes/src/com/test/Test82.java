package src.com.test;

/*
class Outer
{
	int a=10;
	int b=20;
	static int c=30;

	void m1()
	{
		System.out.println("m1 in Outer");
		int a11=101;
		final int b11=202;
		
		class Inner
		{
			int a22=111;
			//static int b22=222;

			{
				System.out.println("IB in Inner");
			}

			void m12()
			{
				System.out.println("m12 in Inner");
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				//System.out.println(a11);
				System.out.println(b11);
				System.out.println(a22);
				//System.out.println(b22);
			}
		}//Inner

		//System.out.println(a22);
		Inner inr=new Inner();
		System.out.println(inr.a22);
		System.out.println("------------");
		inr.m12();
		System.out.println("m1 in closed");
	}//m1

	void m2()
	{
		System.out.println("m2 in Outer");	
	}
	void show()
	{
		System.out.println("show in Outer");
		m1();
	}
}

public class Test82
{
	public static void main(String args[])
	{
		Outer otr=new Outer();
		otr.m1();
		System.out.println("======1======");
		otr.m2();
		System.out.println("======2======");
		otr.show();
	}
}

*/