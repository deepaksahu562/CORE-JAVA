package src.com.jlc2015;

public class Lab1233 {

	public static void main(String[] args) {
	
		System.out.println("Main started");
		try(JLCResource rs = new JLCResource()) {
			//int x = 10/0;	
			//throw new Throwable();
			//throw new Error();
		}catch (Error | Exception e) {
			// TODO: handle exception
		}
		System.out.println("Main ended");
		
	}

}


class JLCResource implements AutoCloseable{
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}