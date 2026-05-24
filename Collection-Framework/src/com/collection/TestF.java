package com.collection;

import java.util.*;

public class TestF {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		lhs.add("abc");
		lhs.add(111);
		lhs.add(222);
		lhs.add(null);
		boolean b=lhs.add(new Integer(111));
		System.out.println(b);
		System.out.println(lhs);
		System.out.println(lhs.contains("abc"));
		
		LinkedHashSet<Object> lhs1=new LinkedHashSet<Object>();
		lhs1.add("xyz");
		lhs1.add("xyz1");
		//lhs1.add(lhs);
		lhs1.addAll(lhs);
		boolean b1=lhs1.add("abc");
		System.out.println(b1);
		System.out.println(lhs1);
		
		Iterator<Object> lt=lhs1.iterator();
		System.out.println("Iterator-----------");
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		
		ArrayList<Object> list=new ArrayList<Object>(lhs1);
		List<Object> list1=new Vector<Object>(lhs1);
		List<Object> list2=new LinkedList<Object>(lhs1);
		
		ListIterator<Object> lt2=list.listIterator();
		while(lt2.hasNext()){
			System.out.println(lt2.next());
		}
		System.out.println("-------------");
		ListIterator<Object> lt3=list1.listIterator();
		while(lt3.hasNext()){
			System.out.println(lt3.next());
		}
		System.out.println("-------------");
		
		ListIterator<Object> lt4=list2.listIterator();
		while(lt4.hasNext()){
			System.out.println(lt4.next());
		}
		System.out.println("-------------");
		
		ArrayList<Object> al=new ArrayList<Object>(lhs1);
		ListIterator<Object> lt1=al.listIterator();
		while(lt1.hasNext()){
			System.out.println(lt1.next());
		}
		System.out.println("-------------");
		while(lt1.hasPrevious()){
			System.out.println(lt1.previous());
		}
		System.out.println("-------------");
	}
}