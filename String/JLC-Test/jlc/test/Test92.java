package jlc.test;
public class Test92
{
	public static void main(String args[])
	{
		String s1=new String("jlc");
		String s2=new String("jlc");
		String s3=new String("jlcindia");
		String s4=new String("jlcindia");
		String s5=new String("abc");
	
		String s6="jlcblr";
		String s7="jlcblr";

		System.out.println(s1==s2);//false
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s6==s7);//true
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s6.hashCode());
		System.out.println(s7.hashCode());


		System.out.println(s5.hashCode());
	}
}