package jlc.pro;

public class Pro101 {

	public static void main(String[] args) {
		Hello h1=null;
		h1=new Hai();
		h1.india();
		h1.indore();
		Hai hai=new Hai();
		hai.india();

	}

}
class Hello{
	static void india(){
		System.out.println("india in Hello");
	}
	void indore(){
		System.out.println("indore in Hello");
	}
}
class Hai extends Hello{
	static void india(){
		System.out.println("india in Hai");
	}
	void indore(){
		System.out.println("indore in Hai");
	}
}