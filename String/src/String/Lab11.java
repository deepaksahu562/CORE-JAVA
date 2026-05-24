package String;

public class Lab11 {

	public static void main(String[] args) {
		String str="Hi This is JLC.Full name Java Learning Center.We are providing training for Java and related frameworks and technologies.Java is popular language in Companies";
		System.out.println(str);
		System.out.println(str.startsWith("Hi"));
		System.out.println(str.startsWith("Welcome"));
		System.out.println(str.startsWith("Full"));
		System.out.println(str.startsWith("Full",15));
		System.out.println(str.startsWith("Companies"));
		System.out.println(str.endsWith("Companies"));
		System.out.println(str.endsWith("Thanks"));
		System.out.println("--------------");
		String st1=str.replace('J','Y');
		System.out.println(st1);
		//String st2=str.replace("Java","NETWORK");
		String st2=str.replaceAll("Java","NETWORK");
		System.out.println(st2);
		System.out.println(str);
		System.out.println("----------------------");
		String st4=str.toLowerCase();
		String st5=str.toUpperCase();
		System.out.println(st4);
		System.out.println(st5);		
	}
}
