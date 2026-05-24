package String;
public class Lab15 {

	public static void main(String[] args) {
		char chArr[]={'J','L','C','I','N','D','I','A'};
		String st1=new String(chArr);
		System.out.println(st1);
		
		String st2=new String(chArr,2,3);
		System.out.println(st2);
		
		System.out.println("=========");
		byte bArr[]={65,89,97,78,120};
		String st3=new String(bArr);
		System.out.println(st3);
		String st4=new String(bArr,1,3);
		System.out.println(st4);
	}

}
