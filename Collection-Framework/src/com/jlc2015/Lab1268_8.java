package com.jlc2015;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab1268_8 {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<String>();
		//Queue<String> que = new PriorityQueue<String>(10, new PSort());
		que.add("India");
		que.add("Bhutan");
		que.add("Japan");
		que.add("India");
		que.add("China");
		
		System.out.println(que);
		System.out.println("Size : "+que.size());
			
		/*System.out.println("Peek : "+que.peek());
		System.out.println("Size : "+que.size());
		System.out.println("Elem : "+que.element());
		System.out.println("Size : "+que.size());
		System.out.println("Poll : "+que.poll());
		System.out.println("Size : "+que.size());*/
		
		int len = que.size();
		
		for (int i = 0; i < len; i++) {
			System.out.println(que.poll());
		}
		System.out.println(que);
		System.out.println("Size : "+que.size());
	}

class PSort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareToIgnoreCase(o1);
	}
	
}
}
