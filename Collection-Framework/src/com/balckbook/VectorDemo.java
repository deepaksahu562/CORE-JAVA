package com.balckbook;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v);
		int x[ ]={22,30,10,40,15,60};
		
		for (int i = 0; i < x.length; i++) {
			v.add(x[i]);
		}
		//System.out.println(v);
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		ListIterator lit=v.listIterator();
		System.out.println("forword-----");
		while(lit.hasNext()){
			System.out.print(lit.next()+"\t");
		}
		System.out.println();
		System.out.println("reverse-----");
		while(lit.hasPrevious()){
			System.out.print(lit.previous()+"\t");
		}
		
		
	}

}
