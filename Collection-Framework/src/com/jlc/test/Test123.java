package src.com.jlc.test;
import java.util.*;

//class Hello{}

public class Test123 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println(al);
		al.add(111);
		al.add("blore");
		al.add(new String ("xyz"));
		//al.add(new Hello());
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add("al1-start");
		al1.add(111.11);
		al1.add(111);
		al1.add(null);
		al1.add("abc");
		al1.add("al1-end");
		System.out.println(al1);
		//al1.add(al);
		al1.addAll(al);
		System.out.println(al1);
		
		System.out.println("-----Iterator-----");
		Iterator it1=al1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		System.out.println("-------ListIterator-----------");
		ListIterator lt=al1.listIterator();
		System.out.println("fowd...................");
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("revs...................");
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
		System.out.println("*****************");
		System.out.println(al);
		System.out.println(al1);
		
		al1.retainAll(al);
		System.out.println(al);
		System.out.println(al1);
		al1.clear();
		System.out.println(al1);
		
	}

}
