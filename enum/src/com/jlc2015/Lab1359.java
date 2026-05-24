/**
 * 
 */
package src.com.jlc2015;

/**
 * @author Deepak
 *
 */
public class Lab1359{
	public static void main(String[] args) {
		Direction dir = null;
		//dir = new Direction();
		dir = Direction.EAST;
		
		System.out.println(dir);
		System.out.println(Direction.EAST == Direction.NORTH);
		Direction dr = Direction.EASTT.valueOf("SOUTH");
		System.out.println(dr);
	}
}

enum Direction {
	
	EAST,
	WEST,
	NORTH,
	SOUTH(),
	
	EASTT("Himanchal"),
	WESTT("Kolkata"),
	NORTHH("Mumbai"),
	SOUTHH(23);
	String value;
	int valuee;
	static{
		System.out.println("SIB");
	}
	
	private Direction() {
		System.out.println("Direction()");
	}
	
	private Direction(String str){
		value = str;
		System.out.println("Direction(String str) :"+str);
	}
	private Direction(int value){
		valuee = value;
		System.out.println("Direction(String str) :"+value);
	}
	
	void hello(){
		
	}

}
