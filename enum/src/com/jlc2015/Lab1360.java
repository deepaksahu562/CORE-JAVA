package src.com.jlc2015;

public class Lab1360 {

	public static void main(String[] args) {
		Driection arr[] = Driection.values();
		for (Driection dri : arr) {
			System.out.println(dri.ordinal() +"\t"+dri.name());
		}
		
		//Driection dir = Driection.valueOf("east");
		Driection dir = Driection.valueOf("EAST");
		System.out.println(dir);
	}
}

enum Driection {
	EAST(0),NORTH(90),WEST(180),SOUTH(270);
	
	int angle;
	
	private Driection(int angle) {
		this.angle = angle;
		System.out.println("Const : " + angle);
	}
	
	static{System.out.println("SIB");}
}