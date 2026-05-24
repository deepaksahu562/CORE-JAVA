package src.com.test;

class Hai {

	int a;
	Hai(int a){
		this.a=a;
	}
}
class Hello implements Cloneable{
	
	int b;
	Hai hai;
	
	Hello(int b,Hai hai){
		this.b=b;
		this.hai=hai;
	}
	
	Hello myClone(){
		Hello h1=null;
		try{
			
			h1=(Hello)this.clone();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return h1;
	}
	
	void show(){
		System.out.println("show in Hello");
		System.out.println(b);
		System.out.println(hai.a);
	}
}