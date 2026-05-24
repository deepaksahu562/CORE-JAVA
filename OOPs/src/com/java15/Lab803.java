package com.java15;

public class Lab803 {

	public static void main(String[] args) {
		Hello803.show();;
	}
}

class Hai803{
	
	static void show(){
		System.out.println("Hai  show():");
	}
	
	static{
		System.out.println("Hai  SB:");
	}
}

class Hello803 extends Hai803{
	static{
		System.out.println("Hello SB :");
	}
	
	/*static void show(){
		System.out.println("Hello  show():");
	}*/
}
