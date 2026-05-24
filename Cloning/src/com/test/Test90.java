package com.test;
class A{
	int p;
	A(int p){
		this.p=p;
	}
}

class B{
	int a;
	A a1;
	B(int a,A a1){
		this.a=a;
		this.a1=a1;
	}
}
class C{
	int x;
	B b1;
	C(int x,B b1){
		this.x=x;
		this.b1=b1;
	}
}

class Hello1 implements Cloneable{
	int a;
	C c1;
	Hello1(int x,B b1){
		this.a=a;
		this.c1=c1;		
	}
	public Object clone(){
		Hello1 h1=null;
		try{
			Class cls=Class.forName("Hello");
			Class cls1[]=cls.getInterfaces();
			String inter_name=cls1[0].getName();
			
			if(inter_name.equals("java.lang.Cloneable")){
				A a1=new A(this.c1.b1.a1.p);
				B b1=new B(this.c1.b1.a,a1);
				C c1=new C(this.c1.x,b1);
				//Hello1(a,c1);
			}else {
				throw new CloneNotSupportedException(this.getClass().getName());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return h1;
	}
	void show(){
		System.out.println("show in Hello");
		System.out.println(a);
		System.out.println(c1.x);
		System.out.println(c1.b1.a);
		System.out.println(c1.b1.a1.p);
	}
}

public class Test90 {

	public static void main(String[] args) {

		A a11=new A(999);
		
	}

}
