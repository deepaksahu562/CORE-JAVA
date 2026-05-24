package com.jlc.p2;

import com.jlc.p1.Hello907;

public class Lab907 {
	public static void main(String[] args) {
		//new Xyz907();
		
		/*Xyz907 ref = new Xyz907();
		ref.display();
		System.out.println(ref.a);*/
	}
}

class Xyz907 extends Hello907{
	/*protected int a = 10;
	protected void display(){}*/
	
	static{
		Xyz907 ref = new Xyz907();
		ref.display();
		System.out.println(ref.a);
	}
	
	{
		display();
		System.out.println(a);
	}
}

class Hai907 extends Hello907{
	void show(){
		/*Xyz907 ref = new Xyz907();
		ref.display();
		System.out.println(ref.a);*/
		
		Hai907 hai = new Hai907();
		hai.display();
		System.out.println(hai.a);
	}
}
