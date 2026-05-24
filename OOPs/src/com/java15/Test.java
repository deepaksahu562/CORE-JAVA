package com.java15;


class Test {
	

	public static void main(String[] args) {
		
		//System.out.println(HiTest.a);
		//System.out.println(new HiTest().a);
		//System.out.println(new HiTest().b);
		//System.out.println(HiTest.c);
		//System.out.println(new HiTest().d);
				
		//HiTest ht = null;
		//System.out.println(ht.a);
		
		//ht.show();
		//HiTest.show();
		
		//new HiTest().show();
		
		/*HelloTest ht = null;
		System.out.println(ht.a);
		System.out.println(ht.b); // NullPointerException
		 */

		HelloTest ht = new HiTest();
		//System.out.println(ht.a);
		System.out.println(ht.b);
		//System.out.println(ht.c); //NOTOK
		//System.out.println(ht.d); //NOTOK
		//ht.display();
		//ht.show();
		
		
		/*HiTest ht = new HiTest();
		System.out.println(ht.a);
		System.out.println(ht.b);
		System.out.println(ht.f);
		System.out.println(ht.g);*/
	}
}

class HelloTest {
	
	static int a = 10;
	int b = 20;
	int f = 70;
	static int g = 80;
	
	static void show(){
		System.out.println("HelloTest - show()");
	}
	static{
		System.out.println("HelloTest - SIB");
	}
	
	void display(){
		System.out.println("HelloTest - display()");
	}
}

class HiTest extends HelloTest {
	static int a = 30;
	//int b = 40;
	int c = 50;
	static int d = 60;
	
	/*static void show(){
		System.out.println("HiTest - show()");
	}*/
	static{
		System.out.println("HiTest - SIB");
	}
	
	static void show(){
		System.out.println("HiTest - show()");
	}
	
	 void display(){
		System.out.println("HiTest - display()");
	}
}

