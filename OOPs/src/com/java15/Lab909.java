package com.java15;

import com.jlc.p1.Hello909;

public class Lab909 {

	public static void main(String[] args) {
		
		Hai909 hai = new Hai909();
		hai.displayy();
		
	}

}

class Hai909 extends Hello909{
	public void displayy(){
		System.out.println("Hai909-display()");
		return;
	}
}
