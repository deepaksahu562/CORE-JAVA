package String;

public class Lab7 {

	public static void main(String[] args) {
		String st1=new String("JLC");
		String st2=st1.intern();
		System.out.println(st1==st2);
		
		String st3="JLC";
		System.out.println(st3==st2);
		String st4="OK".intern();
		String st5="OK";
		System.out.println(st4+"\t"+st5);
		System.out.println(st4==st5);
		

	}

}
