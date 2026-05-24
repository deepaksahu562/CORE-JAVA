package String;

public class Lab12 {

	public static void main(String[] args) {
		String str="Hi This is JLC.Full name Java Learning Center.We are providing training for Java and related frameworks and technologies.Java is popular language in Companies";
		System.out.println(str);
		System.out.println(str.indexOf('Z'));
		//indexOf(String) - Method in class java.lang.String
	    //Returns the index within this string of the first occurrence of the specified substring.
		
		System.out.println(str.indexOf('J'));
		System.out.println(str.indexOf('J',11));
		System.out.println(str.indexOf('J',12));
		System.out.println(str.indexOf('J',27));
		System.out.println("--------------------");
		System.out.println(str.indexOf("XYZ"));
		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("Java",25));
		System.out.println(str.indexOf("Java",27));
		System.out.println("--------------------");
		//lastIndexOf(String, int) - Method in class java.lang.String
	    //Returns the index within this string of the last occurrence of the specified substring,
		//searching backward starting at the specified index. 
		System.out.println(str.lastIndexOf('J'));
		System.out.println(str.lastIndexOf('j',120));
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.lastIndexOf("Java",120));
		System.out.println(str.lastIndexOf("Java",15));
	}

}
