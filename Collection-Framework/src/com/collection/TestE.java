package com.collection;

import java.util.*;

public class TestE {
	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		System.out.println(hs);
		System.out.println(hs.add("aa"));
		hs.add("bb");
		hs.add("cc");
		hs.add(null);
		hs.add(123);
		System.out.println(hs);
		boolean b1=hs.add("aa");
		System.out.println(b1);
		System.out.println("Iterate-----------");
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		List<Object> ll=new ArrayList<Object>(hs);
		ListIterator<Object> lt=ll.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		ArrayList<Object> al=new ArrayList<Object>(hs);
		ListIterator<Object> lt1=al.listIterator();
		while(lt1.hasNext()){
			System.out.println(lt1.next());
		}
		while(lt1.hasPrevious()){
			System.out.println(lt1.previous());
		}
		System.out.println("----------------------");
	}

}


