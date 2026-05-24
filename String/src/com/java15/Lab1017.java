package src.com.java15;

public class Lab1017 {

	public static void main(String[] args) {

		String st1 = "IND";
		String st2 = new String("IND");
		String st3 = "IND";
		String st4 = st2.intern();
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st4);
		
	}

}
