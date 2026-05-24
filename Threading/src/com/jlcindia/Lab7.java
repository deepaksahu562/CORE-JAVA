package com.jlcindia;

class Stack{
	int x;
	boolean flag=false;
	public synchronized void push(int x){
		if(flag){
			try{
				wait();
			}catch (Exception e) {
				System.err.println(e);
			}
		}	
		this.x=x;
		System.out.println(x+"is pushed...."+Thread.currentThread().getName());
		flag=true;
		notify();	
	}
	synchronized public int pop(){
		if(!flag){
			try{
				wait();
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(x+"is poped  ."+Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e);
		}
		flag=false;
		notify();
		return x;
	}
}

class A implements Runnable{
	Stack st=null;
	A(Stack st,String name){
		this.st=st;
		Thread t1=new Thread(this,name);
		t1.start();
	}
	
	public void run(){
		int a=1;
		for(int i=0;i<7;i++){
			st.push(a++);
		}
	}
}

class B implements Runnable{
	Stack st=null;
	B(Stack st,String name){
		this.st=st;
		Thread t1=new Thread(this,name);
		t1.start();
	}
	
	public void run(){
		int a=1;
		for(int i=0;i<7;i++){
			st.pop();
		}
	}
}

public class Lab7 {

	public static void main(String[] args) {
		Stack st=new Stack();
		B obj2=new B(st,"B");
		A obj1=new A(st,"A");
		
	}
}
