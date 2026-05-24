package src.com.balckbook;

public class Employee implements Cloneable{

	int id;
	String name;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void getData(){
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
