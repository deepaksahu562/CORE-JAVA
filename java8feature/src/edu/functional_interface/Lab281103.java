package src.edu.functional_interface;

/**
 * A functional interface can extends another interface only when it does not
 * have any abstract method. A functional interface cann't extends another
 * functional interface.
 */

interface Sayable281103 { }

interface Showable281103 {
	void show(String msg); // abstract method
}

/*@FunctionalInterface
interface Doable281103{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  */

interface Doable281103{
    default void doIt(){
        System.out.println("Do it now");
    }
}

@FunctionalInterface
interface Display281103{
	void dispaly();
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}
/*
 * // Invalid  '@FunctionalInterface' annotation; 
 * // Walkable281103 is not a functional interface
 * @FunctionalInterface 
 * interface Walkable281103 extends Showable281103{ 
 * 		void doSomething();
 * }
 */


  @FunctionalInterface
  interface Walkable281103 extends Showable281103{
  		//void doSomething();
  }


@FunctionalInterface
interface Playable extends Sayable281103 {
	void doIt();
}

//A functional interface is extending to a non-functional interface.
@FunctionalInterface  
interface Eatable281103 extends Doable281103{  
    void say(String msg);   // abstract method  
}

public class Lab281103 {

	public static void main(String[] args) {

	}
}
