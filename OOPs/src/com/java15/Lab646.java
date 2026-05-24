package src.com.java15;

public class Lab646 {

	public static void main(String[] args) {
		System.out.println(HelloHi646.a);
		//new HelloHi646();
		//System.out.println(new HelloHi646().a);
	}
}
 
class HelloHi646{
	
	//HelloHi646 h = new HelloHi646(); //Lab653
	
	static int a =10;
	{
		System.out.println("IIB :"+this );
		//HelloHi646 h = new HelloHi646(); 
	}
	
	
}