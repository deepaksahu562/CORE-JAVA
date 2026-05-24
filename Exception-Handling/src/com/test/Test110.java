package com.test;
import java.io.*;
import java.sql.SQLException;

class AException extends IOException
{
	public String toString()
	{
		return " this is AException";
	}
}

class BException extends RuntimeException
{
	public String toString()
	{
		return " this is BException";
	}
}


class TestException
{
	void m1(int i)throws IOException,RuntimeException,BException
	{
		System.out.println("m1(int i) in TestException");
		if(i==1)
			throw new BException();
		else
			throw new BException();
	}
}

class TestException1 extends TestException
{
/*	void m1(int i)throws AException
	{
		throw new AException();
		//System.out.println("1.ok");
	}
*/
	/*void m1(int i)throws IOException,RuntimeException
	{
		System.out.println("2.ok");
	}*/
	
	/*void m1(int i)throws AException,BException{
		System.out.println("3.ok");
	}*/
	
	/*void m1(int i)throws Exception{
		System.out.println("4.not ok");
	}*/ 
	
	/*void m1(int i)throws InstantiationException,SQLException{
		
		System.out.println("5.not ok");
	}*/
}

public class Test110
{
	public static void main(String args[])throws Exception
	{
		TestException1 te=new TestException1();
		te.m1(100);
	}
}