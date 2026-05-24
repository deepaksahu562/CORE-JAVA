package src.com.jlcindia;

import java.util.*;

public class Lab4 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Integer(99));
		boolean b=hs.add(new Integer(99));
		System.out.println(b);
		System.out.println(hs.add("sri"));
		hs.add("sri@jlc");
		System.out.println(hs.add("sri"));
		System.out.println(hs);
		
		TreeSet ts=new TreeSet();
		//ts.add(new Integer(99));
		System.out.println(ts.add("sri"));
		ts.add("aaa");
		ts.add("ccc");
		ts.add("bbb");
		System.out.println(ts);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(new Integer(99));
		System.out.println(lhs.add("sri"));
		lhs.add("sri@jlc");
		System.out.println(lhs.add("sri"));
		System.out.println(lhs);
	}

}
