package com.balckbook;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("Hello");
		stack.add("Hi");
		stack.add("HelloHi");
		stack.add("HelloHello");
		System.out.println(stack);
		System.out.println(stack.push("HiHI"));
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.search("Hi"));
		
	}

}
