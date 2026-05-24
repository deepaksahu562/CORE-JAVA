package com.java15;

public class Lab951 {
	public static void main(String[] args) {
		A951 aob = new D951();
		System.out.println(aob instanceof A951);
		System.out.println(aob instanceof B951);
		System.out.println(aob instanceof C951);
		System.out.println(aob instanceof D951);
		//System.out.println(aob instanceof E951);
		 		
		/*A951 aob1 = new A951();
		A951 aob2 = new A951();
		System.out.println(aob1.hashCode());
		System.out.println(aob2.hashCode());
		System.out.println(aob1 == aob2);*/
		
		
		
	}
}

class A951{}
class B951 extends A951{}
class C951 extends A951{}
class D951 extends B951{}
class E951{}
