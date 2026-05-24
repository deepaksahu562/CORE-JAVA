package com.balckbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) throws Exception{
		LinkedList ll=new LinkedList();
		ll.add("Shahdol");
		ll.add("Indore");
		ll.add("Bangalore");
		ll.add("Gowa");
		ll.add("Bhopal");
		
		System.out.println("\n:: Linked List Operation ::");
		String opr=null;
		int position,choice=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("\nAdd the element Enter '1'");
		System.out.println("Remove the element Enter '2'");
		System.out.println("Replace the element Enter '3'");
		System.out.println("Exit '4'");
		
		System.out.println("\n\n Enter Your Choice :");
		choice=Integer.parseInt(br.readLine());
		
		while(choice<4){
			switch(choice){
			case 1: System.out.println("---- You want to add the element ----");
					System.out.println("\n Enter the element :");
					opr=br.readLine();
					ll.add(opr);
					System.out.println("__Element add Successfully__");
					choice=5;
					break;
			case 2: System.out.println("----- You want to remove the element -----");
					System.out.println("\n Enter the index position :");
					position=Integer.parseInt(br.readLine());
					ll.remove(position-1);
					System.out.println("__Element is deleted__");
					choice=5;
					break;
			case 3: System.out.println("----- You want to replace the element ----");
					System.out.println("\n Enter the index position :");
					position=Integer.parseInt(br.readLine());
					System.out.println("\n Enter the element :");
					opr=br.readLine();
					ll.set(position-1, opr);
					choice=5;
					break;
			default : return;
			}
			System.out.println("\n\n The Final Element is :\n");
			Iterator it=ll.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
	}
}
