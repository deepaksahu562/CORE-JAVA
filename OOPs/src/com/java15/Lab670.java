package src.com.java15;

import java.util.Scanner;

public class Lab670 {

	public static void main(String[] args) {
		System.out.println(Test670.a);
		System.out.println("Delete");
		Scanner sc =new Scanner(System.in);
		sc.nextLine();
		
		Test670 t = new Test670();
		t.show();
		System.out.println("main");
	}
}


class Test670{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	static int a =10;
	
	public Test670() {
		System.out.println("deccons");
	}
	
	public Test670(int a) {
		System.out.println("deccons -1");
	}
	
	void show(){
		System.out.println("show");
		return;
	}
}