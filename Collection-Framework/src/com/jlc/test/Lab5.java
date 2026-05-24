package com.jlc.test;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Lab5 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.put("sid",new Integer(99));
		hm.put("sname", "sri");
		hm.put("email", "deep@gmail.com");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("sid"));
		System.out.println(hm.containsKey("sir1"));
		System.out.println(hm.containsValue("deep@gmail.com"));
		System.out.println(hm.containsValue("deep"));
		System.out.println(hm.get("sname"));
		System.out.println(hm);
		hm.put("sname1", "vas");
		System.out.println(hm);
		hm.put(null, "dsk");
		hm.put(new Double(999.99), null);
		hm.put(101, "kumar");
		System.out.println(hm);
		//hm.remove("xx");
		System.out.println(hm.remove("xx"));
		System.out.println(hm.remove("sname1"));
		System.out.println(hm);
		Collection col=hm.values();
		System.out.println(col);
		
		
		System.out.println("using keySet()");
		Set s=hm.keySet();
		System.out.println(s);
		Set s1=hm.entrySet();
		System.out.println(s1);
		
		Iterator it = s1.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		
	}

}
