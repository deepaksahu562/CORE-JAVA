package com.java15;

public class Lab754 {

	public static void main(String[] args) {
		Hello754 h = new Hello754();
		h.show(5, 6);
	}
}


class Hello754{
	void show(int ...b){
		System.out.println("$$$$$$$");
	}
	
	/*void show(int a, int b){
		System.out.println("#######");
	}*/
	
	void show(long a, long b){
		System.out.println("#######");
	}
}
