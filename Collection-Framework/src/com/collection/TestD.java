package src.com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestD {

	public static void main(String[] args) {
		
		Vector<Object> v1=new Vector<Object>();
		System.out.println(v1);
		v1.add("abc");
		v1.add("xyz");
		v1.add("xyz");
		v1.add(null);
		v1.add(0);
		v1.addElement(111);
		v1.add(new Double(12.23));
		
		System.out.println(v1);
		
		Enumeration<Object> en=v1.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		System.out.println("--------------------");
		
		Iterator<Object> it=v1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		
		System.out.println("-------@@@@@@@------");
		ListIterator<Object> lt1=v1.listIterator();
		while(lt1.hasNext()){
			System.out.println(lt1.next());
		}
		System.out.println("++++++++++++++++++++");
		while(lt1.hasPrevious()){
			System.out.println(lt1.previousIndex()+"\t"+lt1.previous());
		}
	}
}
