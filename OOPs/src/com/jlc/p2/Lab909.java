package src.com.jlc.p2;

import com.jlc.p1.Hello909;

public class Lab909{
	public static void main(String[] args) {
		Hai909 hai = new Hai909();
		//hai.display();
		//System.out.println(hai.display());
	}
}


class Hai909 extends Hello909{
	void display(){
		System.out.println("Hai909-display()");
	}
	void display(int a){}
}