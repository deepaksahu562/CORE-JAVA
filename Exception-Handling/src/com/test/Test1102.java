package com.test;
import java.io.IOException;

class India{
	void show1()throws Exception{
		System.out.println("show1() in India");
	}
}
class Indore extends India{
	void show1(){
		
		
		System.out.println("show2() in Indore");
	}
}

public class Test1102
{
	public static void main(String args[])
	{
		try{
			System.out.println("Hello");
			India india=null;
			india=new Indore();
			india.show1();
		}catch(Exception e){
			System.out.println("I'v never seen");
		}
	}
}