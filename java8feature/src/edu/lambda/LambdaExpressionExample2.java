package src.edu.lambda;

//@FunctionalInterface // It is optional
interface Drawables {
	public void draw();
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		int width = 10;

		System.out.println("Hello");
		/*// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing-1 " + width);
			}
		};
		d.draw();

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing-2 " + width);
		};
		d2.draw();*/
	}
}