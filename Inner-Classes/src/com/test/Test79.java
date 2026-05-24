package src.com.test;
/*
class Outer
{
	int a=10;
	static int b=20;

	void m1()
	{
		System.out.println("m1 in Outer");
	}

	static void m2()
	{
		System.out.println("m2 in Outer");
	}

	class Inner
	{
		int a11=101;
		int a=111;
		//static int b11=202;
		
		void m11()
		{
			System.out.println("m11 in Inner");
		}

		Inner()
		{
			System.out.println("Default const in Inner");
		}
		
		static void m22()
		{
			System.out.println("m22 in Inner");
		}
		

		void showInner()
		{
			int a=100;
			System.out.println("showInner in Inner");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(b);
			System.out.println(a11);
			
			m1();
			m2();
			m11();
		}

	}//Inner complete

	void showAll()
	{
		System.out.println("show an in outer");
		System.out.println(a);
		System.out.println(b);
		Inner inr=new Inner();
		//System.out.println(a11);
		System.out.println(inr.a11);
		inr.m11();
	}

}

public class Test79
{
	public static void main(String args[])
	{
		Outer otr1=new Outer();
		otr1.showAll();
		System.out.println("-----------1------------");

		//Inner innr=new Inner();
		//from other class create the Inner class Object.
		//Outer.Inner oi=Outer.new Inner();
		//Outer.Inner oi2=new Inner();
		//Outer.Inner oi3=new Outer.Inner();
		
		Outer.Inner oi4=new Outer().new Inner();
		Outer.Inner oi5=otr1.new Inner();

		System.out.println(oi4.a11);
		System.out.println("------------2------------");
		oi4.showInner();
		//oi4.showAll();
		otr1.showAll();
		//otr1.m11();
		//oi5.showInner();
	}
}
*/