package src.com.balckbook;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arl=new ArrayList();
		System.out.println(arl);
		arl.add("Apple");
		System.out.println(arl);
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		
		System.out.println("Contents :"+arl);
		arl.clear();
		System.out.println("Contents :"+arl);
		/*
		arl.addAll(2, arl);
		System.out.println("Contents :"+arl);
		*/
		/*arl.addAll(arl);
		System.out.println("Contents :"+arl);
		*/
				
		/*
		arl.add(1, "Banana");
		System.out.println("Contents :"+arl);
		*/
		
		/*
		boolean bl=arl.add("Orenge");
		System.out.println(bl);
		System.out.println("Contents :"+arl);
		*/
				
		/*
		arl.remove(2);
		System.out.println("Content after remove index :"+arl);
		*/
		
		/*
		arl.remove("Grapes");
		System.out.println("content after remove element :"+arl);
		*/
		
		System.out.println("Size :"+arl.size());
		/*
		System.out.println("Extracting using Iterator :-");
		Iterator it=arl.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		*/
		
		/*
		System.out.println("Extracting using foreach :-");
		for (String el : arl) {
			System.out.println(el);
		}
		*/
		/*
		System.out.println("Extracting using ListIterator with Next:-");
		ListIterator lt=arl.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println("Extracting using ListIterator with Previous:-");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
			System.out.println(lt.previousIndex());
		}
		*/
		/*
		System.out.println("Extracting using ListIterator with Previous:-");
		ListIterator lt1=arl.listIterator();
		while(lt1.hasPrevious()){
			System.out.println(lt.previous());
		}
		*/
		
	}

}
