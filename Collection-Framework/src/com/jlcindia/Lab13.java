package src.com.jlcindia;
import java.util.*;
public class Lab13 {

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("sid", 101);
		hm.put("sub", "Hindi");
		System.out.println(hm);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(101);
		lhs.add(101);
		lhs.add("Hello");
		
		Iterator it=lhs.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
				
		System.out.println("------------");
		List al=new ArrayList(lhs);
		ListIterator lit=al.listIterator();
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
		
		Vector c=new Vector(al);
		c.add(101);
		Enumeration enm=c.elements();
		while(enm.hasMoreElements()){
			System.out.println(enm.nextElement());
		}
		
		System.out.println("++++++++++++");
		HashSet hs=new HashSet(c);
		Iterator it1=hs.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}	
	}
}
