package src.edu.lambda;

@FunctionalInterface // It is optional
interface Drawable {
	public void draw();
}

@FunctionalInterface
interface Callable{
	public void move();
	default void call(){
        System.out.println("I am calling");
    }
}

public class Lab281111 {

	public static void main(String[] args) {
		int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing-1 " + width);
			}
		};
		d.draw();

		// with lambda Drawable implementation using lambda
		Drawable d2 = () -> {
			System.out.println("Drawing-2 " + width);
		};
		d2.draw();
		
		Callable call = () -> System.out.println("This is Callable.....");
		call.call();
		call.move();
	}
}