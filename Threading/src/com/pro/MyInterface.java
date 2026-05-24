package com.pro;

public interface MyInterface extends Runnable{

}

class HelloThread implements MyInterface{
	HelloThread(){
		System.out.println("DC in HelloThread");
		run();
		//start();
	}
	public void run() {
		System.out.println("run in HelloThread");
	}
}

