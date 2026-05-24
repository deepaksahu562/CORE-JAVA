package com.jlc2015;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab1267 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(9);
		set.add(4);
		set.add(20);
		set.add(11);
		System.out.println(set);
		
		Set nset = set.descendingSet();
		System.out.println(nset);
		
		Iterator it = set.iterator();
		
		System.out.println("Ascending Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		System.out.println("Descending Iterator");
		Iterator dit = set.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		
		/*System.out.println(set.subSet(4, 11));
		System.out.println(set.subSet(4, false,11 , true));
		System.out.println(set.subSet(4, true,11 , false));
		System.out.println(set.headSet(9));
		
		System.out.println(set.ceiling(8));
		System.out.println(set.floor(8));
		*/
		
	}

}
