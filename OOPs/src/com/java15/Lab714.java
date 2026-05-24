package com.java15;

public class Lab714 {

	public static void main(String[] args) {
		Test714 test = new Test714();
		//test.show('A', 'B');
	}
}

class Test714{
	
	void show(int a, int b){
		System.out.println("int-int");
	}
	
	/*void show(long a, long b){
		System.out.println("long-long");
	}*/
	
	void show(long a, char b){
		System.out.println("long-char");
	}
}
