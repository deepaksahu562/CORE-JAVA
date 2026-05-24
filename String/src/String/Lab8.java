package String;

public class Lab8 {

	public static void main(String[] args) {
		String st1="JLC";
		String st2="INDIA";
		String st3=st1+st2;
		String st4=st1+"INDIA";
		String st5="JLC"+st2;
		
		System.out.println(st1+"\t"+st2+"\t"+st3+"\t"+st4+"\t"+st5);
		System.out.println(st3==st4);
		System.out.println(st3==st5);
		System.out.println(st4==st5);
		
		String st6="JLC"+"INDIA";
		final String st7="JLC";
		final String st8="INDIA";
		String st9=st7+st8;
		System.out.println(st6+"\t"+st9);
		System.out.println(st6==st9);
		String st10="JLCINDIA";
		System.out.println(st6==st10);
		
		System.out.println("========================");
		
		String s11="jlc";
		String s12="jlc";
		System.out.println(s11.hashCode());
		System.out.println(s12.hashCode());
		System.out.println(s11==s12);
		System.out.println(s11.equals(s12));
		
		String s13="india";
		String s14="india";
		System.out.println(s13.hashCode());
		System.out.println(s14.hashCode());
		System.out.println(s13==s14);
		System.out.println(s13.equals(s14));
		
		String s15=new String("abc");
		String s16=new String("abc");
		
		System.out.println(s15.hashCode());
		System.out.println(s16.hashCode());
		System.out.println(s15==s16);
		System.out.println(s15.equals(s16));
	
		
		
	}

	
}
