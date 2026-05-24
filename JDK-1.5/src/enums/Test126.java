package enums;

class Hellox{
	
	enum Course{
		DATABASE,
		COREJAVA("corejava",7000,"som"),
		JDBC("jdbc",2000,"rai"),
		EJB("ejb",2000),
		FLEX("flex");
		
		String topic;
		double cost;
		String flty="sri";
		String time="7-9";
		
		Course(){
			//super("abc",10);
		}
		
		Course(String topic,double cost,String flty){
			this.topic=topic;
			this.cost=cost;
			this.flty=flty;
		}
		
		Course(String topic,double cost){
			this.topic=topic;
			this.cost=cost;
		}
		
		Course(String topic){
			this.topic=topic;
		}
		
		public String getTopic(){
			return topic;
		}
		
		public double getCost(){
			return cost;
		}
		
		public String getTime(){
			return time;
		}
		
		
		void show(){
			Course c[]=Course.values();
			
			System.out.println("Topic\t"+topic+"\nCost\t"+cost+"\nFclty\t"+flty+"\nTime\t"+time);
		}
	}
}

public class Test126 {

	public static void main(String[] args) {
		
		Hellox h1=new Hellox();
		Hellox.Course cc[]=Hellox.Course.values();
		for (Hellox.Course c : cc) {
			c.show();
			System.out.println("\n");
		}
	}

}
