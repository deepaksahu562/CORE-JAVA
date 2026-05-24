package src.com.java15;

public class Lab1022 {

	public static void main(String[] args) {

		String str1 = "SDLINDIA";
		String str2 = "SDL"+"INDIA";

		final String str3 = "SDL";
		final String str4 = "INDIA";
		String str5 = str3 + str4;
		String str6 = str3 + "INDIA";
		
		System.out.println(str1+"\t"+str2+"\t"+str5);
		System.out.println(str1 == str2);
		System.out.println(str1 == str5);
		System.out.println(str2 == str5);
		System.out.println(str1 == str6);
		
	}
}
