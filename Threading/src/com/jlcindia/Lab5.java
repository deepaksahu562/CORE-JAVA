package com.jlcindia;

/*
class Hello{
	synchronized void m1(){
		for(int i=0;i<=5;i++){
			System.out.println("m1-"+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	
	synchronized void m2(){
		for(int i=10;i<=5;i++){
			System.out.println("m2-"+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}

class A implements Runnable{
	Hello h=null;
	A(Hello h,String name){
		this.h=h;
		Thread t=new Thread(this,name);
		t.start();
		System.out.println(t.getThreadGroup().getName());
	}
	public void run(){
		h.m1();
	}
}

class B implements Runnable{
	Hello h=null;
	B(Hello h,String name){
		this.h=h;
		Thread t=new Thread(this,name);
		t.start();
		System.out.println(t.getThreadGroup().getName());
	}
	public void run(){
		h.m2();
	}
}



public class Lab5 {

	public static void main(String[] args) {
		Hello h=new Hello();
		new A(h,"A");
		new B(h,"B");
	}

}
*/