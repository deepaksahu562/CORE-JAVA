package com.jlc2015;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab1266_6 {

	public static void main(String[] args) {
		Queue<Stud> que = new PriorityQueue<Stud>();
		que.add(new Stud());
		que.add(new Stud());
		System.out.println(que);
	}

}

class Stud{}