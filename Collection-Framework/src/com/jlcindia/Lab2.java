package src.com.jlcindia;

import java.util.*;

public class Lab2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al);
		al.add(new Integer(99));
		al.add("sri");
		al.add("123");
		al.add("sri@jlc");
		al.add("sri");
		System.out.println(al);
		al.add(0,"aaaa");
		al.add(2,"bbbb");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("sri"));
		System.out.println(al.lastIndexOf("sri"));
		al.set(0, "jlc");
		System.out.println(al);
		
		List list=al.subList(1, 4);
		System.out.println(list);
		
		
		System.out.println("forward order");
		
		ListIterator li=al.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		System.out.println("reverse order");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
}

}
