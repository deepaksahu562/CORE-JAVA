package String;

public class Lab13 {

	public static void main(String[] args) {
		String st="Hello JLC   Students";
		System.out.println(st+":\t:"+st.length());
		String st1=st.trim();
		System.out.println(st1+":\t:"+st1.length());
		System.out.println();
		String str1="Hello JLC Students,";
		String str2="Welcome to All";
		String str=str1.concat(str2);
		System.out.println(str);
		//String st11=str.substring(7,2);
		//System.out.println(st11);
		System.out.println();
		String st11=str.substring(7);
		System.out.println(st11);
		String st12=str.substring(7, 17);
		System.out.println(st12);
		//System.out.println(str.substring(7,2));//not vailid
		System.out.println(st1.charAt(0));
		System.out.println(st1);
		System.out.println(st1.charAt(14));
		//System.out.println(st1.charAt(133));
	}

}
