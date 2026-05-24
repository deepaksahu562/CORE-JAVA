package src.com.jlcindia;

import java.util.*;
import java.util.List;

public class Lab9 {

	public static void main(String[] args) {
		int arr[]={10,45,25,6,78,12,21};
		int arr1[]={10,45,25,6,78,12,21};
		int arr2[]={10,45,85,45,12,78,896};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("-------");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"\t");
		}
		System.out.println("--------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr, arr2));
		
		Arrays.sort(arr, 2, 5);
		System.out.println("\n*********** arr Agter sorting ******************");
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("------------");
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 9));
		System.out.println(Arrays.binarySearch(arr, 21));
		System.out.println(Arrays.equals(arr, arr1));
		System.out.println(Arrays.equals(arr, arr2));
		
		Arrays.fill(arr, 32);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("--------");
		Object ob[]={"jlc","india","sri","vas","white","red"};
		for (int i = 0; i < ob.length; i++) {
			System.out.print(ob[i]+"\t");
		}
		System.out.println();
		System.out.println("++++++++++++++");
		List list=Arrays.asList(ob);
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
		
		System.out.println();
		Arrays.sort(ob);
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]+"\t");
		}
		System.out.println();
	}

}
