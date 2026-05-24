package com.jlc.test;
public class Test113
{
	public static void main(String args[])
	{
		String str=Thread.currentThread().getName();
		System.out.println(str);

		String str1=Thread.currentThread().getThreadGroup().getName();
		System.out.println(str1);
		int i1=Thread.currentThread().getPriority();
		System.out.println(i1);

		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread("desk");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.setName("Thr-jlc");
		t1.setPriority(9);
		
		System.out.println(t1);
		System.out.println(t1.getPriority());
		System.out.println(Thread.currentThread().getName());

		System.out.println("The ThreadName :"+t1.getName()+"\nThe Thread Group :"+t1.getThreadGroup().getName()+"\nThe Thread Priority :"+t1.getPriority());
	}
}
