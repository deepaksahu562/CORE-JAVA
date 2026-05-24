package src.com.java15;

public class Lab616 {

	public static void main(String[] args) {
		System.out.println("Main :"+Hello616.a);
	}
}


class Hello616{
	static int a;
	static{
		String a = "JLC";
		System.out.println("\n static block :"+a);
		System.out.println("\n static block :"+Hello616.a);
		//System.out.println("\n static block :"+this.a);
		//System.out.println("\n static block :"+Hello616.this.a); 
		// this cann't use from static context
	}
}