package src.com.java15;

public class Test {

	public static void main(String[] args) {
		
	String str1 = "hello";
	String str2 = new String("hello");
	System.out.println(str1 == str2);
	
	String str3 = str1.toLowerCase();
	System.out.println(str1 == str3);
		
	String str6 = str2.toLowerCase();
	System.out.println(str2 == str6);
	System.out.println(str1 == str6);
	
	String str4 = "hello";
	String str5 = str1.intern();
	//String str5 = str1;
	System.out.println(str4 == str5);
	
	System.out.println("str1 :"+str1.hashCode());
	System.out.println("str2 :"+str1.hashCode());
	System.out.println("str3 :"+str1.hashCode());
	System.out.println("str4 :"+str1.hashCode());
	System.out.println("str5 :"+str1.hashCode());
	System.out.println("str6 :"+str1.hashCode());
	
	
	
	}
}