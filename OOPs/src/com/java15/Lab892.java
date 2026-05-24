package src.com.java15;

public class Lab892 {

	public static void main(String[] args) {
		
		System.out.print(new B892().show());

	}

}


class A892{
	private int show(){
		return 9;
	}
}

class B892 extends A892{
	public int show(){
		return 1;
	}
}