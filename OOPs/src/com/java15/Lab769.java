package src.com.java15;

public class Lab769 {

	public static void main(String[] args) {
		main(null);
		//System.out.println(Hello769.a);
	}
	
	/*public void main(int[] args) {
	}
*/
}

class Hi769{
	static int a =10;
	static{
		System.out.println("a : "+a);
	}
}
class Hello769 extends Hi769{
	static int b = 20;
	static{
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}