package src.com.jlc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Deepak");
		col.add(101);
		col.add("shahdol");
		System.out.println("Collection : "+col+"\nSize : "+col.size());
		System.out.println("-------------------");
		Collection coll = new ArrayList();
		coll.add("Vineeta");
		coll.add(201);
		coll.add("jabalpur");
		System.out.println("Collection : "+coll+"\nSize : "+coll.size());
		System.out.println("-------------------");
		coll.addAll(col);
		System.out.println("Collection : "+coll+"\nSize : "+coll.size());
		List list = (ArrayList)coll;
		System.out.println("Collection : "+list+"\nSize : "+list.size());
		List sublist = list.subList(2, 4);
		System.out.println(sublist);
		sublist.add(0, "Java");
		System.out.println(sublist);
		sublist.remove(1);
		System.out.println(sublist);
		sublist.remove("Java");
		System.out.println(sublist);
		sublist.set(0, "Vineeta");
		System.out.println(sublist);
	}
}
