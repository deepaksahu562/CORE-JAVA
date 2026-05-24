package com.test;
public class werpp {

	public static void main(String[] args) {
		
		int i1=123;
		byte b1=12;
		short s1=15;
		float f1=34.4f;
		double d1=12345.3;
		long l1=343454;
		char c1='a';
		
				
		System.out.println("primitiv - wrapper");
		
		Long lw1=new Long(l1);
		System.out.println(lw1);
		Long lw2=Long.valueOf(56565);
		System.out.println(lw2);
		
		Double dw1=new Double(d1);
		System.out.println(dw1);
		Double dw2=Double.valueOf(4534.5);
		System.out.println(dw2);
				
		Float fw1=new Float(f1);
		System.out.println(fw1);
		Float fw2=new Float(32.4);
		System.out.println(fw2);

		Float fw3=Float.valueOf(f1);
		System.out.println(fw3);
		Float fw4=Float.valueOf(34.4f);
		System.out.println(fw4);	
		
		
		Integer iw1=new Integer(i1);
		System.out.println(iw1);
		Integer iw2=new Integer(34);
		System.out.println(iw2);
		
		Integer iw3=Integer.valueOf(i1);
		System.out.println(iw3);
		Integer iw4=Integer.valueOf(344);
		System.out.println(iw4);
		
		Byte bw1=new Byte(b1);
		System.out.println(bw1);
		Byte bw2=new Byte((byte)78);
		System.out.println(bw2);
		
		Byte bw3=Byte.valueOf(b1);
		System.out.println(bw3);
		Byte bw4=Byte.valueOf((byte)98);
		System.out.println(bw4);
		
		Short sw1=new Short(s1);
		System.out.println(sw1);
		Short sw2=new Short((short)34);
		System.out.println(sw2);
		
		Short sw3=Short.valueOf(s1);
		System.out.println(sw3);
		Short sw4=Short.valueOf((short)545);
		System.out.println(sw4);
		
		
		
		System.out.println("wrapper - primitiv");
		
		int ip=iw1.intValue();
		System.out.println(ip);
		byte bp=bw1.byteValue();
		System.out.println(bp);
		float fp=fw1.floatValue();
		System.out.println(fp);
		double dp=dw1.doubleValue();
		System.out.println(dp);
		short sp=sw1.shortValue();
		System.out.println(sp);
		long lp=lw1.longValue();
		System.out.println(lp);
		
		System.out.println("primitiv - stirng");
		
		String str1=String.valueOf(b1);
		System.out.println(str1);
		String str2=Byte.toString(b1);
		System.out.println(str2);
		String str3=String.valueOf(45);
		System.out.println(str3);
		String str4=Byte.toString((byte)35);
		System.out.println(str4);
		
		String str5=String.valueOf(i1);
		System.out.println(str5);
		String str6=String.valueOf(s1);
		System.out.println(str6);
		String str7=String.valueOf(f1);
		System.out.println(str7);
		String str8=Double.toString(d1);
		System.out.println(str8);
		String str9=Long.toString(l1);
		System.out.println(str9);
		
		System.out.println("Stirng - primitiv");
		
		int ip1=Integer.parseInt(str5);
		System.out.println(ip1);
		double dp1=Double.parseDouble(str8);
		System.out.println(dp1);
		
		System.out.println("wrapper to string");
		String ss1=iw1.toString();
		System.out.println(ss1);
		String ss2=lw1.toString();
		System.out.println(ss2);
		
		System.out.println("string to wrapper");
		Integer i11=new Integer(str5);
		System.out.println(i11);
		Byte b11=new Byte(ss1);
		System.out.println(b11);

	}

}
