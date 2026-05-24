package enums;

interface I1{
	void m11();
}

class A{}

enum e{}

//enum e1 extends e{}

//enum e2 extends A{}

enum enm implements I1{
	ab,bc;
	public void m11(){
		System.out.println("m1() in enum");
	}
	
	public void m22(){
		System.out.println("m2() in enum");
	}
}

public class Test127 {

	public static void main(String[] args) {
		I1 i1=enm.ab;
		i1.m11();
		//i1.m22();
		
		enm.ab.m22();
	}

}
