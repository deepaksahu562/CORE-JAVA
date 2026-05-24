package src.com.java15;

public class Lab920 {

	public static void main(String[] args) {
		/*A920 a = new B920();
		System.out.println(a.x);*/
		
		B920 b = new B920();
		//b.x = "Shahdol";
		//System.out.println(b.x);
		
		A920 aa = b;
		//System.out.println(aa.x);
		System.out.println(b.x);
		System.out.println(((A920)b).x);

	}
}

class A920{
	int x = 10;
}

class B920 extends A920{
	String x = "India";
}