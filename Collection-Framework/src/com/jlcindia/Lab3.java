package com.jlcindia;

import java.util.*;

public class Lab3 {
	public static void main(String[] args) {
		Vector v=new Vector();
		//List v1=new Vector();
		//v1.add("desk");
		v.add("99");
		v.add("sri");
		v.addElement("sri@jlc");
		v.addElement("sri");
		//v.addElement(v1);
		System.out.println(v);
		
		Enumeration e=v.elements();
		System.out.println("forword order----");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		Iterator it=v.iterator();
		System.out.println("forword order----");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ListIterator lt=v.listIterator();
		while(lt.hasPrevious()){
			System.out.println(lt.previous());	
		}
		LinkedList ll=new LinkedList();
		ll.addFirst("11");
		ll.addLast("22");
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
	}
}
