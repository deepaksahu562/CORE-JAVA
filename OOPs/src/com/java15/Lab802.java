package com.java15;

class Hi802{

	public static void main(String[] args) {
		System.out.println("Main");
	}

	static{
		System.out.println("ISB Hi802");
	}
}

public class Lab802 extends Hi802{
	static{
		System.out.println("ISB Lab802");
	}
	
	/*public static void main(String[] args) {
		System.out.println("Main -lab");
	}*/
}
