package src.com.jlcindia;
public class Lab25 {

	public static void main(String[] args) {
		
		//Primitive to Wrapper
		System.out.println("Primitive to Wrapper");
		Integer in1=new Integer(344);
		System.out.println(in1);
		
		int i1=123;
		Integer i2=new Integer(i1);
		System.out.println(i2);
		
		Boolean b1=new Boolean(true);
		System.out.println(b1);
		
		Character ch1=new Character('A');
		System.out.println(ch1);
		
		
		Byte by11=new Byte((byte)12);
		System.out.println(by11);
		
		Integer in2=Integer.valueOf(123);
		System.out.println(in2);
		
		Character ch2=Character.valueOf('B');
		System.out.println(ch2);
		
		Boolean b2=Boolean.valueOf(false);
		System.out.println(b2);
		
		//Wrapper to Primitive
		System.out.println("Wrapper to Primitive");
		byte byVal=by11.byteValue();
		System.out.println(byVal);
		
		
		Short shVal=in1.shortValue();
		System.out.println(shVal);
		
		int iVal=in1.intValue();
		System.out.println(iVal);
		
		long lnVal=in1.longValue();
		System.out.println(lnVal);
		
		double dVal=in1.doubleValue();
		System.out.println(dVal);
		
		char chVal=ch1.charValue();
		System.out.println(chVal);
		
		boolean bVal=b1.booleanValue();
		System.out.println(bVal);
		
		
		//Primitive to String
		System.out.println("Primitive to String");
		int val=12345;
		String st1=val+"";
		System.out.println(st1);
		String st2=""+val;
		System.out.println(st2);
		String st3=String.valueOf(val);
		System.out.println(st3);
		String st4=Integer.toString(val);
		System.out.println(st4);
		
		//String to Primitive
		System.out.println("String to Primitive");
		int ab=Integer.parseInt("565");
		System.out.println(ab);
		byte by1=Byte.parseByte("123");
		System.out.println(by1);
		//byte by2=Byte.parseByte("129");
		//System.out.println(by2);
		double d1=Double.parseDouble("354.3");
		System.out.println(d1);
		//boolean b3=Boolean.parseBoolean("OK");
		//System.out.println(b3);
		
		//String to Wrapper
		System.out.println("String to Wrapper");
		Integer in3=new Integer("123");
		System.out.println(in3);
		//Integer in4=new Integer("jlc");
		//System.out.println(in4);
		Boolean b4=new Boolean("Sri");
		System.out.println(b4);
		Boolean b5=new Boolean("TrUe");
		System.out.println(b5);
		
		//Wrapper to String
		String str1=in1.toString();
		System.out.println(str1);
		String str2=ch1.toString();
		System.out.println(str2);
		String str3=b1.toString();
		System.out.println(str3);
		
		//Other Methods
		System.out.println("Other Methods");
		String binStr=Integer.toBinaryString(45453);
		System.out.println(binStr);
		String hexStr=Integer.toHexString(5345345);
		System.out.println(hexStr);
		String octStr=Integer.toOctalString(45345345);
		System.out.println(octStr);
		Integer in11=new Integer(123);
		Integer in12=new Integer(123);
		System.out.println(in11.compareTo(in12));
		System.out.println(in11.equals(in12));
		System.out.println("**************");
		
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isAlphabetic('9'));
		System.out.println(Character.isDigit('4'));
		System.out.println(Character.isDigit('j'));
		System.out.println(Character.isMirrored('M'));
		System.out.println(Character.isMirrored('('));
		System.out.println(Character.isMirrored('{'));
		System.out.println(Character.isMirrored('%'));
		
	}
}
