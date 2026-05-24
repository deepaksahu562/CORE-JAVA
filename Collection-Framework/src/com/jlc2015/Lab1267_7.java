package com.jlc2015;

import java.util.PriorityQueue;

public class Lab1267_7 {

	public static void main(String[] args) {

		int values [] = {1, 7, 6, 4, 9};
		int len = values.length;
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		System.out.println(pq1);
		for (int x : values) {
			pq1.offer(x);
		}
		System.out.println(pq1);
		for (int i = 0; i < len; i++) {
			System.out.println(pq1.poll()+" ");
		}
		
		/*for (Integer integer : pq1) {
			System.out.println(integer);
		}*/
		
		
	}

}
