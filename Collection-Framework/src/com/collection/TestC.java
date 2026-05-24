package src.com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestC {

	public static void main(String[] args) {
	
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add("xyzabc");
		ll.add("xyzabc");
		ll.add("123");
		ll.add(null);
		ll.add(new Integer(111));

		ListIterator<Object> lt=ll.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.nextIndex()+"\t"+lt.next());
		}
		System.out.println("---------");
		/*while(lt.hasPrevious()){
			System.out.println(lt.previousIndex()+"\t"+lt.previous());
		}
		*/
		while(lt.hasNext()){
			System.out.println(lt.nextIndex()+"\t"+lt.next());
		}
		
		System.out.println("---------");
		while(lt.hasPrevious()){
			System.out.println(lt.previousIndex()+"\t"+lt.previous());
		}
	}
}
