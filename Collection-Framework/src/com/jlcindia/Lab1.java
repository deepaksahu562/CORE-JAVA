package src.com.jlcindia;

import java.util.*;

public class Lab1 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println("------------------");
		
		al.add(new Integer(99));
		al.add("sri");
		al.add("123");
		al.add("sri@jlc");
		al.add(new Double(999.99));
		al.add(new Long(11111));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println("------------------");
		//System.out.println(al[0]);
		Object[] obj=al.toArray();
		System.out.println(obj);
		System.out.println(obj[1]);
		System.out.println(obj.length);
		System.out.println("Printing directly");
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}
		
		System.out.println("Checking and casting");
		for (int i = 0; i < obj.length; i++) {
			Object o=obj[i];
			if(o instanceof String){
				System.out.println("String---------");
				String str=(String)o;
				System.out.println(str);
			}else if(o instanceof Integer){
				System.out.println("Integer--------");
				Integer in=(Integer)o;
				System.out.println(in);
			}else if(o instanceof Double){
				System.out.println("Double---------");
				Double bl=(Double)o;
				System.out.println(bl);
			}
		}
		
		System.out.println("Iterator================");
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(al.contains("sri"));
		System.out.println(al.contains("jlc"));
		System.out.println(al.containsAll(al));
		al.add("126");
		System.out.println(al);
		al.remove("126");
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		al1.add("dd");
		System.out.println(al1);
		System.out.println(al);
		System.out.println(al.size());
		//al.add(al1);
		//System.out.println(al);
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println("++++++++++++++++");
		
		//al.removeAll(al);
		//al.retainAll(al1);
		//System.out.println(al);
		al1.retainAll(al);
		//System.out.println(al1);
		
		//al.clear();
		System.out.println(al);
				
	}

}
