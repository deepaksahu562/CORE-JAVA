package edu.ivq.test;

public class Test1 {

	public static void main(String[] args) {
		try {
			int i;
			return;
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}
	}

}
