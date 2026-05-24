package src.com.java15;

public class Lab1081 {


	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JLC");
		//sb.append("WELCOME");
		//sb.append(234.6765);
		//sb.append(true);
		//sb.setLength(2);
		//System.out.println(sb.capacity());
		//sb.ensureCapacity(-2);
		
		System.out.println(sb);
		System.out.println("L : "+sb.length());
		System.out.println("C : "+sb.capacity());
		
		String str = "JLC";
		System.out.println(str.equals(sb.toString()));
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("A");
		
		System.out.println(sb1.equals(sb2));
	}

}
