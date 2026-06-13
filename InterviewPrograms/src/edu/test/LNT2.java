package src.edu.test;

public class LNT2 {

	public static void main(String[] args) {
		DisplayLNT2 obj = new DisplayLNT2();
		obj.print(new String("Hello"));
		obj.print("Hai");
		obj.print(new StringBuffer("Hello"));
		obj.print(new StringBuilder("Hello"));
		//obj.print(null); //Ambiguse
		
	}
}

class DisplayLNT2{
	
	public void print(String str){
		System.out.println("DisplayLNT2 - String:"+str);
	}
	
	public void print(StringBuffer str){
		System.out.println("DisplayLNT2 - StringBuffer:"+str);
	}
	
	public void print(StringBuilder str){
		System.out.println("DisplayLNT2 - StringBuilder:"+str);
	}
	
	public void print(Object obj){
		System.out.println("DisplayLNT2 - Object"+obj);
	}
}