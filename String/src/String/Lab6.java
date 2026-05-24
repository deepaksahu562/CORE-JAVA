package String;

public class Lab6 {

	public static void main(String[] args) {
		String str1="JLC";
		String str2="JLC";
		String str3="JLC";
		
		System.out.println(str1+"\t"+str2+"\t"+str3);
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println("----------------------");
		
		String ref1=new String("JLC");
		String ref2=new String("JLC");
		System.out.println(ref1+"\t"+ref2);
		System.out.println(ref1==ref2);
		System.out.println(str1==ref1);
		System.out.println(str1==ref2);
		
		String ref3=new String("SD");
		String ref4=new String("SD");
		System.out.println(ref3+"\t"+ref4);
		System.out.println(ref3==ref4);

	}

}
