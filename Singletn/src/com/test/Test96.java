package com.test;

class Singletn{
	
	//1.step
	private Singletn(){
	}
	//2.step
	static Singletn sn=null;
	//3.step
	static{
		sn=new Singletn();
	}
	//4.step
	static Singletn getSingletnObj(){
		return sn;
	}
	
	void show(){
		System.out.println("show in singletn");
	}
}

public class Test96 {

	public static void main(String[] args) {
		
		//Singletn stn1=new Singletn();
		
		Singletn stn=Singletn.getSingletnObj();
		stn.show();
		
		Singletn stn1=Singletn.getSingletnObj();
		stn.show();
		
		System.out.println(stn==stn1);
		System.out.println(stn.hashCode());
		System.out.println(stn1.hashCode());
	}
}
