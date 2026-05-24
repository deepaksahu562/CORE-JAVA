package com.test;

public class Near100 {
	public static void main(String[] args) {
		int cont1 = 0;
		int cont2 = 0;
		int num1 = 130;
		int num2 = 120;
		
		for (int i = 100; i >0; i--) {
			cont1++;
			if (num1==i) {
				break;
			}
			if (num2==i) {
				break;
			}
		}
		
		for (int i = 100; i <200; i++) {
			cont2++;
			if (num2==i) {
				break;
			}
			if (num1==i) {
				break;
			}
		}
		
		if (cont1>cont2 && cont2<cont1) {
			System.out.println(num1+"is near");
		}else {
			System.out.println(num2+"is near");
		}
		
	}

}




















/*class MyThread1 extends Thread{
	int number = 0;
	boolean isStope = false;
	
	public MyThread1(int number) {
		this.number = number;
	}
	
	public void run(){
		for (int i = 100; i > 0; i--) {
			if (number==i) {
				System.out.println(number+"is near about 100");
				isStope = true;
			}
			if (isStope) {
				break;
			}
		}
		for (int i = 100; i < 200; i++) {
			if (number==i) {
				System.out.println(number+"is near about 100");
				isStope = true;
			}
			if (isStope) {
				break;
			}
		}
	}
}
class MyThread2 extends Thread{
	int number = 0;
	boolean isStope = false;
	
	public MyThread2(int number) {
		this.number = number;
	}

	
	public void run(){
		for (int i = 100; i < 200; i++) {
			if (number==i) {
				System.out.println(number+"is near about 100");
				isStope = true;
			}
			if (isStope) {
				break;
			}
		}
		for (int i = 100; i > 0; i--) {
			if (number==i) {
				System.out.println(number+"is near about 100");
				isStope = true;
			}
			if (isStope) {
				break;
			}
		}
	}
}*/