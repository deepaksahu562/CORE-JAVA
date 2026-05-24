package src.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Hello1 {
	void m1() {
		System.out.println("m1 in Hello1");
	}
}

public class TestB {

	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<Object>();
		al.add(111);
		al.add(1, "bangalore");
		al.add(new String("xyz"));
		al.add(999);
		al.add(new Hello1());
		System.out.println(al);

		List<Object> al1 = new ArrayList<Object>();
		al1.add("al1-Start");
		al1.add(111.11);
		al1.add(null);
		al1.add("abc");
		al1.add("al1 End");
		System.out.println("++++++++++");
		System.out.println(al1);
		
		Object a=al1.remove(1);
		System.out.println(a);
		
		boolean b=al1.remove("abc");
		System.out.println(b);
		
		System.out.println(al1);
		System.out.println("++++++++++");
		
		al1.add(3, "desk");
		
		
		
		// al1.add(al);
		al1.addAll(al);
		System.out.println(al1);

		Iterator<Object> it1 = al1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println(al);
		System.out.println(al1);

		/*
		 * al1.retainAll(al); System.out.println(al); System.out.println(al1);
		 */
		al1.retainAll(al);
		System.out.println(al);
		System.out.println(al1);

		al1.clear();
		System.out.println(al1);
		System.out.println(al);

		al.clear();
		System.out.println(al);
		System.out.println("==============");
		System.out.println(al);
		System.out.println(al1);
	}
}
