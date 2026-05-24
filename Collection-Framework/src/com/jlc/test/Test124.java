package com.jlc.test;
import java.util.*;

public class Test124 {

	public static void main(String[] args) {
		
		System.out.println("----------Vector-------------");
		Vector v1=new Vector();
		v1.add("abc");
		v1.add("xyz");
		v1.add(null);
		v1.addElement(111);
		v1.add(new Double(11.21));
		
		
		System.out.println("by Enumeration");
		Enumeration en=v1.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		System.out.println("by Iterator");
		Iterator it1=v1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("---------LinkedList-----------");
		
		LinkedList ll=new LinkedList();
		
		ll.add("xyzabc");
		ll.add("123");
		ll.add(null);
		ll.add(new Integer(11));
		
		Iterator it2=ll.iterator();
		
		while (it2.hasNext()) {
			System.out.println(it2.next());
			
		}
		
		/*Enumeration en1=(Enumeration)ll.element();
		while (en1.hasMoreElements()) {
			//System.out.println(en.nextElement());
			Object object = (Object) en1.nextElement();
			
		}*/
		
	}

}
