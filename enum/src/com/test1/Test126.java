package src.com.test1;

import com.test1.Hello.Course;

class Hello{

	enum Course{
		DATADASE,
		COREJAVA("core java",7000,"Kapil"),
		JDBC("jdbc",2000,"Manish"),
		EJB("ejb",2000),
		FLEX("flex");
				
		String topic;
		double cost;
		String fity="xyz";
		String time="7-9";
		
		
		Course() {
			System.out.println("Course()");
			//super("ABC",10);
		}
		Course(String topic,double cost,String fity){
			System.out.println("Course-3");
			this.topic=topic;
			this.cost=cost;
			this.fity=fity;
		}
		Course(String topic,double cost){
			System.out.println("Course-2");
			this.topic=topic;
			this.cost=cost;
		}
		Course(String topic){
			System.out.println("Course-1");
			this.topic=topic;
		}
		
		public String getTopic() {
			System.out.println("getTopic()");
			return topic;
		}
		public double getCost() {
			return cost;
		}
		public String getFity() {
			return fity;
		}
		public String getTime() {
			return time;
		}
		
		
	}//enum
}

public class Test126 {
	void show(){
		
		Hello.Course[] c= Hello.Course.values();
		for (Hello.Course co : c) {
			System.out.println(co.getCost());
			
		}
	}
	public static void main(String[] args) {

		Hello h1=new Hello();
		Hello.Course cc[]=Hello.Course.values();
		
		Test126 t=new Test126();
		t.show();
		
	}
}
