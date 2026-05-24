package com.java15;

public class Lab1087 {


	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JLCINDIA");
		
		
		System.out.println(sb);
		System.out.println("L : "+sb.length());
		System.out.println("C : "+sb.capacity());
		
		sb.ensureCapacity(-2);
		
		System.out.println(sb);
		System.out.println("L : "+sb.length());
		System.out.println("C : "+sb.capacity());
		
		
	}

}
