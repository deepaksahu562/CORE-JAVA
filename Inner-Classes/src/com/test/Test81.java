package com.test;

/*
class Outer
{
	int a=10;
	int b=20;
	static int c=30;

	void m1()
	{
		System.out.println("non static m1 in Outer");
	}
	static void m2()
	{
		System.out.println("static m2 in Outer");
	}

	static class Inner
	{
		int a11=101;
		static int b11=202;

		{
			System.out.println("IB in Inner");
		}

		static 
		{
			System.out.println("SB in Inner");
		}

		void m11()
		{
			System.out.println("m11 in Inner");
			//System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			System.out.println(a11);
			System.out.println(b11);
			//m1();
			m2();
		}

		static void m22()
		{
			System.out.println("m22 in Inner");
			//System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			//System.out.println(a11);
			System.out.println(b11);
		}
	}//static Inner class

	void showAll()
	{
		System.out.println("showAll in Outer");
		Inner inr=new Inner();
		System.out.println(inr.a11);
		System.out.println(inr.b11);
		System.out.println(Inner.b11);
		inr.m11();
		inr.m22();		
		Inner.m22();
	}
}

public class Test81
{
	public static void main(String args[])
	{
		Outer otr=new Outer();
		//Outer.Inner oi1=new Outer().new Inner();
		//Outer.Inner oi2=otr.new Inner();	
		Outer.Inner oi3=new Outer.Inner();
		Outer.Inner oi4=new Outer.Inner();
		//Outer.Inner oi5=otr.Inner();
		oi3.m11();
		oi3.m22();
		System.out.println("--------------------");
		Outer.Inner.m22();
		System.out.println("--------------------");
		otr.showAll();
	}
}
*/