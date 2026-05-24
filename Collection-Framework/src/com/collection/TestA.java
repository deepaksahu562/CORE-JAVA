package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Hello{
	@Override
	public String toString() {
		return "HelloClass";
	}
}
public class TestA {

	public static void main(String[] args){
		ArrayList<Object> al1=new ArrayList<Object>();
		List<Object> al2=new ArrayList<Object>();
		
		System.out.println(al1);
		System.out.println(al2);
		
		al1.add(111);
		al1.add(new Integer(222));
		al1.add("abc");
		al1.add("blore");
		al1.add(new Hello());
		System.out.println(al1);
		
		System.out.println("----------------------");
		
		al2.add(111);
		al2.add(new Integer(222));
		al2.add("abc");
		al2.add("blore");
		al2.add(new Hello());
		System.out.println(al2);
		
		
		for (Object object : al2) {
			System.out.println(object);
		}
		
		Iterator<Object> it=al1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("=====================");
		Iterator<Object> it1=al1.listIterator(2);
		while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}

		System.out.println("=====================");
		ListIterator<Object> lit=al2.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		System.out.println("..........................................");
		ListIterator<Object> lit1=al2.listIterator(2);
		
		while(lit1.hasNext()){
			System.out.println(lit1.next());
		}
		
		while(lit1.hasPrevious()){
			System.out.print(lit1.previousIndex()+"\t:");
			System.out.println(lit1.previous());
		}	
	}
}
