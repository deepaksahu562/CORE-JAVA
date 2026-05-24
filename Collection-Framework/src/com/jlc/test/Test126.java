package com.jlc.test;
import java.util.*;



public class Test126 {

	public static void main(String[] args) {
	
		HashSet<Object> hs=new HashSet<Object>();
		System.out.println(hs.add("aa"));
		hs.add("bb");
		hs.add("cc");
		hs.add("11");
		hs.add(new Integer(10));
		hs.add(new Integer(10)); // Ignore dublicate elements. 
		hs.add(null);
		System.out.println(hs);
		
		boolean b1=hs.add("aa");
		System.out.println(b1);
		System.out.println(hs);
		
		System.out.println("**** Itretor *****");
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
		System.out.println("******* ListItretor ********");
		List ll=new ArrayList(hs);
		ListIterator lt=ll.listIterator();
		
		System.out.println("ford dir");
		while (lt.hasNext()) {
			System.out.println(lt.next());			
		}
		
		System.out.println("rev dir");
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
		
		System.out.println("===== LinkedHashSet =====================");
		
		LinkedHashSet lhs=new LinkedHashSet();
		System.out.println(lhs);
		lhs.add("abc");
		lhs.add(111);
		lhs.add(null);
		lhs.add(222);
		lhs.add(new Integer(111));
		System.out.println(lhs.add(111));
		System.out.println(lhs);
		
		System.out.println(lhs.contains("abc"));
		
		LinkedHashSet lhs1=new LinkedHashSet(lhs);
		System.out.println(lhs1.add("xyz"));
		System.out.println(lhs1.add("xyz1"));
		System.out.println(lhs1.add(lhs));
		System.out.println(lhs1.add("abc"));
		System.out.println(lhs1.addAll(lhs));
		
		System.out.println(lhs1);
		
		System.out.println("========= TreeSet ==================");
		
		TreeSet ts=new TreeSet();
		ts.add("bb");
		ts.add("dd");
		ts.add("aa");
		ts.add("cc");
		//ts.add(new Integer(10));
		System.out.println(ts.add("cc"));
		//System.out.println(ts.add(11));
		//System.out.println(ts.add(null));
		
		System.out.println(ts);
		
	}

}
