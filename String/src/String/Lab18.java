package String;

public class Lab18 {

	public static void main(String[] args) {
		int ab=10;
		int bc=23;
		String str=String.format("sum of %d and %d is %d",ab,bc,(ab+bc));
		System.out.println(str);
		int val=97;
		String st=String.format("%d  %h  %o  %c",val,val,val,val);
		System.out.println();
		System.out.println(st);
		System.out.printf("%d  %h %o  %c",val,val,val,val);
		}

}
