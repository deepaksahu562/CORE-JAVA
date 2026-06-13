package src.StringBuffer;

public class Lab20 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append(true);
		sb.append(985.251);
		System.out.println("=========");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append('A');
		sb.append(new Student());
		System.out.println("=========");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("=========");
		StringBuffer sb1=new StringBuffer(30);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("============");
		StringBuffer sb2=new StringBuffer("Hello");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println("============");
		StringBuffer sb3=new StringBuffer();
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		sb3.append("dfsfsfdsfsdfsdf453534534534tgergdfg");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
	}
}
class Student{}