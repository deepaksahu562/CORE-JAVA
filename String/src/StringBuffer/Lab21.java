package StringBuffer;

public class Lab21 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("JLC");
		char arr[]={'A','B','C','D'};
		sb.append(true);
		sb.append(arr);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.reverse();
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(20);
		System.out.println(sb.length());
		System.out.println(sb);
		sb.append("srinivas");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.setLength(7);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(4, "JAVALEARINGCENTER");
		System.out.println(sb);
		System.out.println("============");
		String str="ABC";
		StringBuffer sbo=new StringBuffer("ABC");
		System.out.println(str.equals(sbo));
		System.out.println(str.contentEquals(sbo));
		System.out.println("=============");
		StringBuffer obj=new StringBuffer("OKJLC");
		System.out.println(obj.length());
		System.out.println(obj.capacity());
		obj.trimToSize();
		System.out.println(obj.length());
		System.out.println(obj.capacity());
	}

}
