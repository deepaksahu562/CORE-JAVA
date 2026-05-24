package com.jlcindia;

import java.util.*;

public class Lab8 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("bb");
		al.add("cc");
		al.add("dd");
		al.add("aa");
		
		System.out.println(al.size());
		System.out.println(al);
		//al.add(new Integer(99));
		//Collections.sort(al);
		//Collections.reverse(al);
		//Collections.shuffle(al);
		//Collections.rotate(al, 2);
		Collections.swap(al, 1, 3);
		System.out.println(al);
		
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		//Collections.sort(al);
		System.out.println(Collections.binarySearch(al,"aa"));
		//Collections.fill(al,"jlc");
		System.out.println("---------------");
		
		Vector v=new Vector();
		v.add("99");
		v.add("sri");
		v.addElement("abc");
		Enumeration e=v.elements();
		List al1=Collections.list(e);
		
		
		System.out.println();
		System.out.println(v);
		System.out.println(al1);
		
		//al1=Collections.unmodifiableList(al1);
		//al1.add("11");
		
		System.out.println(al1);	
	}
}
