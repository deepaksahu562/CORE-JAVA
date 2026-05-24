package com.jlc.test;

import java.util.*;
//class Hello{}
public class Test118 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println(al);
		
		al.add(11);
		al.add(new Integer(22));
		al.add(new Double(123.12));
		//al.add(new Hello());
		
		System.out.println(al);
		
		System.out.println("for loop");
		
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
			//System.out.println(al);
		}
		
		System.out.println("each-for loop");
		for (Object obj : al) {
			System.out.println(obj);
		}
		
		System.out.println("*******");
		ArrayList al1=new ArrayList();
		
		al1.add("abc");
		//al1.add(new Hello());
		al1.add(999);
		al1.add(112.221);
		
		for (Object obj : al1) {
			if (obj instanceof Integer) {
				System.out.println(obj);
			}
			else if (obj instanceof Double) {
				System.out.println(obj);
			}
			else {
				System.out.println(obj);
			}
		}
	}

}
