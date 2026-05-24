package src.com.test;
import java.io.IOException;

class CheckException extends Exception
{
	public String toString()
	{
		//return this.getClass().getName();
		return "It is CheckException";
	}
}

class UncheckException extends RuntimeException
{
	public String toString()
	{
		return this.getClass().getName();
	}
}

class TestCheckUncheck
{
	void m7(int a)
	{
		try{
		
		if(a==0)
			throw new ArithmeticException();
		else
			throw new ArrayIndexOutOfBoundsException();
		}catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("Exception in m7");
		}
	}

	void m6()
	{
		System.out.println("m6 in Test checkUncheck");
		try{
			throw new UncheckException();
		}catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("Exception in m6");
		}
	}

	void m5(int i)//throws CheckException
	{
		System.out.println("m5(int i) in checkUncheck");
		try{
			if(i==0)
				throw new UncheckException();
			else
				throw new CheckException();
		}
		catch(Exception e)
		{
			//System.out.println(e);
			System.out.println("Exception in m5");
		}
	}

	void m4(int i)throws IOException
	{
		try{
			if(i==0)
				throw new IOException();
			else
				throw new CheckException();
		}
		catch(CheckException e)
		{
			System.out.println(e);
		}
	}

	void m3()throws CheckException,UncheckException
	{
		System.out.println("m3 in TestcheckUncheckException");
	}

	void m2()throws InstantiationException
	{
		System.out.println("m2 in TestCheckUncheck");
		m7(111);
		m6();
	}

	void m1()throws CheckException,IOException
	{
		System.out.println("m1 in TestCheckUncheck");
		m5(222);
		m4(333);
		m3();
	}
}

public class Test109
{
	public static void main(String args[])throws CheckException,IOException
	{
		TestCheckUncheck tcu=new TestCheckUncheck();
		try{
			tcu.m2();
			tcu.m1();
		}
		catch(InstantiationException e)
		{
			System.out.println(e);
		}
		System.out.println("end");
	}
}