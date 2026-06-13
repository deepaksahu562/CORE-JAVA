package src.com.test2;

public class Pro404 {

	public static void main(String[] args) {

		String s1=new String("data");
		String s2=new String("base");
		System.out.println(s1.hashCode());
		s1=s1+s2;
		System.out.println(s1.hashCode());
		
		StringBuffer sb1=new StringBuffer("data");
		StringBuffer sb2=new StringBuffer("base");
		System.out.println(sb1.hashCode());
		//sb1=sb1.append(sb2);
		System.out.println(sb1.hashCode());
	}

}
