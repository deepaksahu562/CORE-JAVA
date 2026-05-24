package com.jlcindia;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Lab6 {

	public static void main(String[] args) {
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("sid", new Integer(99));
		hm.put("sname", "Sri");
		hm.put("fee", new Double(9000.99));
		System.out.println(hm);
		hm.put("x", "10");
		hm.put(new Integer(99), "10");
		System.out.println(hm);
		hm.put("x", "20");
		System.out.println(hm);
		System.out.println(hm.put(null, null));
		System.out.println(hm);
		
		System.out.println("------Hashtable-----");
		Hashtable ht=new Hashtable();
		ht.put("sid", new Integer(99));
		ht.put("sname", "sri");
		ht.put("fee", new Double(9000.99));
		System.out.println(ht);
		ht.put("x", "10");
		ht.put(new Integer(99), "10");
		System.out.println(ht);
		ht.put("x", "20");
		//ht.put("Helo", null);
		//ht.put(null, "Hi");
		//ht.put(null, null);
		System.out.println(ht);
		
		System.out.println("------TreeMap-----");
		TreeMap tm=new TreeMap();
		tm.put("sid", new Integer(99));
		tm.put("sname", "sri");
		tm.put("fee", new Double(99.99));
		System.out.println(tm);
		tm.put("x", "10");
		//tm.put(new Integer(99), "10");
		System.out.println(tm);
		System.out.println(tm.put("x", "20"));
		System.out.println(tm);
		tm.put("z", null);
		System.out.println(tm);
		//tm.put(null, "s");
		System.out.println(tm);
	}

}
