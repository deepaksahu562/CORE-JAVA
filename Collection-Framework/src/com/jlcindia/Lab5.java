package com.jlcindia;

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
		System.out.println("-----------------");
		hm.put("sid", new Integer(99));
		hm.put("sname", "sri");
		hm.put("email", "abc");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
		System.out.println("+++++++++++++++");
		System.out.println(hm.containsKey("sid"));
		System.out.println(hm.containsKey("sid1"));
		System.out.println(hm.containsValue("sri"));
		System.out.println(hm.containsValue("sri1"));
		System.out.println(hm.get("sname"));
		System.out.println(hm);
		System.out.println("===================");
		
		hm.put("sname", "vas");
		System.out.println(hm);
		hm.put("sname1", "vas");
		System.out.println(hm);
		hm.put(null, "vas");
		hm.put("desk", null);
		System.out.println(hm);
		System.out.println("+++++++++++++++");
		hm.put(new Double(99.99), null);
		System.out.println(hm);
		//hm.remove("xx");
		System.out.println("........................");
		Collection col=hm.values();
		System.out.println(col);
		System.out.println(hm);
		Collection col1=hm.keySet();
		System.out.println(col1);
		
		System.out.println("using keySet()-------------");
		Set s=hm.keySet();
		System.out.println(s);
		
		
		Iterator it=s.iterator();
		while(it.hasNext()){
			//System.out.println(it.next());
			
			Object o1=it.next();
			String key="";
			if(o1!=null){
				key=o1.toString();
			}else{
				key=null;
			}
			Object o2=hm.get(key);
			String val="";
			if(o2!=null){
				val=o2.toString();
			}else{
				val=null;
			}
			System.out.println(key+"--"+val);
			
		}

		System.out.println("using entrySet()------------");
		Set es=hm.entrySet();
		Iterator it1=es.iterator();
		while(it1.hasNext()){
			Object o=it1.next();
			Map.Entry me=(Map.Entry)o;
			Object o1=me.getKey();
			String key="";
			if(o1!=null){
				key=o1.toString();
			}else{
				key=null;
			}
			Object o2=me.getValue();
			String val="";
			if(o2!=null){
				val=o2.toString();
			}else{
				val=null;
			}
			System.out.println(key+"----"+val);
		}
	}
}
