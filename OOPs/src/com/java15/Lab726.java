package com.java15;

public class Lab726 {

	public static void main(String[] args) {
		int x= 10;
		System.out.println("Main Begines : "+x);
		new Aa().m1(x+10);
		System.out.println("Main Ends : "+x);
	}

}


class Cc{
	void m3(int x){
		System.out.println("m3 Begines : "+x);
		x = x+2;
		System.out.println("m3 Ends : "+x);
	}
}

class Bb{
	void m2(int x){
		System.out.println("m2 Begines : "+x);
		new Cc().m3(x+10);
		System.out.println("m3 Ends : "+x);
	}
}

class Aa{
	void m1(int x){
		System.out.println("m1 Begines : "+x);
		new Bb().m2(x+10);
		System.out.println("m1 Ends : "+x);
	}
}
