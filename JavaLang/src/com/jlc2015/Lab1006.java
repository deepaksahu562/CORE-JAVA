package src.com.jlc2015;


public class Lab1006 {
	
	public static void main(String[] args) {

		String st1 = new String("Indore");
		String st2 = new String("Indore");
		String st3 = new String("Pune");
		String st4 = st1;
		
		System.out.println("------hashCode");
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println("using == op");
		System.out.println(st1==st2); // Why
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		
		System.out.println("using .equal op");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		
	}
	
}
