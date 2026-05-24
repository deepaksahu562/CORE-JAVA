package com.test;
class Hello
{
	int m1(int i)
	{
		System.out.println("m1(int i) in Hello");
		try{
			int i1=10/i;
			System.out.println(i1);
			return i1;
		}catch(Exception e){
			System.out.println(e+"----"+e.getMessage());
		}finally{
			System.out.println("I am inside finalyy in m1");
		}
		System.out.println("I am outside finally in m1");
		return 10;
	}

	int m2(int i)
	{
		System.out.println("m2(int i) in Hello");
		try{
			int i1=10/i;
			return i1;
		}
		catch(Exception e){
			System.out.println("----Messg-----"+e);
			//return 50;
		}

		finally{
			System.out.println("I am inside finaly in m2()");
			return 100;
		}
				
		//System.out.println("hi");
		//return 20;
		//System.out.println("hi");

		
	}
}
class Test104
{
	public static void main(String args[])
	{
		Hello h1=new Hello();
		int j=h1.m1(Integer.parseInt(args[0]));
		System.out.println(j);
		int k=h1.m2(Integer.parseInt(args[1]));
		System.out.println(k);		
	}
}