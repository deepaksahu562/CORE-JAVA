package src.com.balckbook;

public class CloneDemo {

	public static void main(String[] args)throws CloneNotSupportedException {

		Employee e1=new Employee(101,"Deepak");
		System.out.println("Orignal Object");
		e1.getData();
		
		Employee e2=(Employee)e1.clone();
		System.out.println("Cloned object");
		e2.getData();
		e2.id=102;
		e2.name="Kumar";
		e2.getData();
		
		//Object obj=e2.getClass();
		//System.out.println(obj);
	}

}
