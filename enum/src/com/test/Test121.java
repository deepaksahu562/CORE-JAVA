package src.com.test;



enum COLOR{
	RED,BLACK,BLUE,CYAN;
	int a=10;
	static int b=20;
		
	{
		System.out.println("IB in COLOR");
	}
	
	static{
		System.out.println("SB in COLOR");
	}
	
	
	void m1(){
		System.out.println("m1 in COLOR");
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m2(){
		System.out.println("m2 in COLOR");
		//System.out.println(a);
		System.out.println(b);
	}
}

class Hello{
	enum COURSE{
		JAVA,SPRING,FELX,JDBC;
		
		enum e1{
			AB,BC,CD;
			
			void m11(){
				System.out.println("m11 in e1-Hello");
			}
			static void m12(){
				System.out.println("m12 in e1-Hello");
			}
		}//e1
		
		void mm(){
			System.out.println("mm in COURSE");
		}
		
		static void mm1(){
			System.out.println("mm1 in COURSE");
		}		
	} //enum COURSE
	
	void show(){
		System.out.println("show in Hello");
		
		COLOR c1[]=COLOR.values();
		for (COLOR color : c1) {
			System.out.println(color+"------"+color.ordinal());
		}	
		
		//COLOR.m1();
		COLOR.RED.m1();
		COLOR.BLACK.m1();
		COLOR.m2();
		System.out.println("*********************");
		System.out.println(COLOR.RED.a);
		//System.out.println(COLOR.a);
		System.out.println(COLOR.RED.a);
		System.out.println(COLOR.b);
	}
	
	void show1(){
		System.out.println("show1 in Hello");
		COURSE.JAVA.mm();
		COURSE.JDBC.mm1();
		COURSE.mm1();
		
		System.out.println("############");
		
		COURSE.e1 e[]=COURSE.e1.values();
		for (COURSE.e1 e11 : e) {
			System.out.println(e11+"\t"+e11.ordinal());
		}
		
		COURSE.e1.AB.m11();
		COURSE.e1.m12();
	}
}

public class Test121 {

	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.show();
		h1.show1();
		
		//h1.COUSER.JAVA.mm();
		Hello.COURSE.JAVA.mm();
		
		Hello.COURSE cc[]=Hello.COURSE.values();
		for (Hello.COURSE hc : cc) {
			System.out.println(hc+"\t"+hc.ordinal());
		}
		
		Hello.COURSE.e1 hce[]=Hello.COURSE.e1.values();
		
		for (Hello.COURSE.e1 hce1 : hce) {
			System.out.println(hce1);
		}
		
		Hello.COURSE.e1.AB.m11();
		Hello.COURSE.mm1();
		Hello.COURSE.e1.m12();
		Hello.COURSE.e1.AB.m12();
	}
}
