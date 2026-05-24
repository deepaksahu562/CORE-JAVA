package src.com.java15;

public class Lab1174 {

	public static void main(String[] args) {
		Hello1174 hello = Hello1174.getHelloInstance();
		System.out.println(hello.hashCode());
		System.out.println(Hello1174.getHelloInstance().hashCode());
		System.out.println(hello.hashCode() == Hello1174.getHelloInstance().hashCode());
		System.out.println(hello);
	}

}

class Hello1174 {

	private static Hello1174 hello;

	private Hello1174() {
	}

	public static Hello1174 getHelloInstance() {

		if (hello == null) {
			//synchronized (hello) {
				hello = new Hello1174();
			//}
		}

		return hello;
	}
}