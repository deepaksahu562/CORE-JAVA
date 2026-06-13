package src.com.tes1;

import src.com.test2.Demo;

public class Info extends Demo {
	public void display(){
		System.out.println(show());
	}
	
	public int show(){
		return super.show();
	}
}
