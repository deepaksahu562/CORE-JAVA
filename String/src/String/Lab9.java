package String;

public class Lab9 {

	public static void main(String[] args) {
		String st1="JLC";
		String st2="JLC";
		String st3=new String("JLC");
		String st4="jlc";
		
		System.out.println(st1+"\t"+st2+"\t"+st3+"\t"+st4);
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st1.equalsIgnoreCase(st4));
		
		System.out.println("---------------");
		int ab=94;
		int bc=76;
		int res=ab-bc;
		System.out.println(res);
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("AEC".compareTo("ABC"));
		System.out.println("AEL".compareTo("ABC"));
		System.out.println("ADC".compareTo("ABC"));
		System.out.println("ABC".compareTo("ADC"));
		System.out.println("ABC".compareTo("ABCDEFGH"));
		System.out.println("ABC".compareTo("ABMDEFGH"));
		System.out.println("ABC".compareTo("Abc"));
		System.out.println("ABC".compareToIgnoreCase("Abc"));
		System.out.println("ABC".compareToIgnoreCase("Abg"));
	}

}
