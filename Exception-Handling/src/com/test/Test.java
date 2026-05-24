package com.test;


interface Type1
{
	void f()throws CloneNotSupportedException;
}
interface Type2
{
	void f()throws InterruptedException;
}
abstract class Type3 implements Type1,Type2{
	public void f(){
		System.out.println();
	}
}


public class Test {

	public static void main(String[] args) {

		

	}

}
