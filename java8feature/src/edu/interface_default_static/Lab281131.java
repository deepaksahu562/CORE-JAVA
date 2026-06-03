package src.edu.interface_default_static;

@FunctionalInterface
interface Sayable281131 {
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
		sayLouder("jj");
		Sayable281131.sayLouder("KK");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
		//say();
	}
}
public class Lab281131 implements Sayable281131{  
    public void sayMore(String msg){        // implementing abstract method   
        System.out.println(msg);
		say();
		//sayLouder("jj");
		Sayable281131.sayLouder("fdfdff");
	}
    
    /*public void say() {
		System.out.println("Hello, this is method @@@@@@@@@@@@");
	}*/

	/*//@Override
	static void sayLouder(String msg) { //this is not Override
		System.out.println(msg);
		//say();
	}*/
    
    
    public static void main(String[] args) {  
    	Lab281131 dm = new Lab281131();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method  
        Sayable281131.sayLouder("Helloooo...");   // calling static method
		//Lab281131.sayLouder("Helloooo...");
		//say();  //Not Ok
		//sayLouder("jj");  //Not Ok
        //dm.sayLouder("Helloooo...");  //Not Ok
    }
}

interface Interf{
	public static void main(String[] args) {
		Lab281131 dm = new Lab281131();
		dm.say();   // calling default method
		dm.sayMore("Work is worship");  // calling abstract method
		Sayable281131.sayLouder("Helloooo...");   // calling static method
	}
}


