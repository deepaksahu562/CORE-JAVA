package src.com.jlc.test;

import java.util.*;

class Hello{}

public class Test112 {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		System.out.println(al1);
		al1.add(111);
		al1.add(new Integer(222));
		al1.add("abc");
		al1.add("blore");
		al1.add(new Hello());
		System.out.println(al1);
		
		System.out.println(al1);
		
		System.out.println("1st way............");
		for(Object o:al1){
			System.out.println(o);
		}
		
		System.out.println("2nd way............");
		Iterator it=al1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
				
		System.out.println("frw dire *************");
		ListIterator li1=al1.listIterator();
		while (li1.hasNext()) {
			System.out.println(li1.next());
		}
		
		
		System.out.println("revs dir**************");
		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
	}

}
