package src.com.java15;

public class Lab716 {

	public static void main(String[] args) {
		Test716 test = new Test716();
		//test.show(null);
		//test.show("India");
		//test.show(test);
		
		
		//System.out.println(null); //725
		
		/*String str = null;
		System.out.println(str);*/ //SAME
	}
}

class Test716{
	
	void show(String str){
		//str.concat("Heli");
		//System.out.println(str); //SAME
		System.out.println("@@@@@@@@@@@");
	}
	
	void show(Object obj){
		//obj.hashCode();
		System.out.println("##########");
	}
	
	/*void show(Test716 obj){ //Lab717
		//obj.hashCode();
		System.out.println("##########");
	}*/
	
	/*void show(char[] arr){ //Lab719
		//obj.hashCode();
		System.out.println("##########");
	}*/
}
