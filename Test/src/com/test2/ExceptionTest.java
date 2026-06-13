package src.com.test2;
class ExceptionTest {

	 void functionOne() throws Exception {
	  try {
	   System.out.println("9");
	   throw new XYZException();

	  } catch (XYZException ex) {
	   System.out.println("8");
	   throw new Exception(ex);
	  } catch (Exception ex) {
	   System.out.println("7");
	  } finally {
	   System.out.println("6");
	  }
	  System.out.println("5");
	 }

	 class XYZException extends Exception {

	 }

	 public static void main(String s[]) {
	  try {
	   new ExceptionTest().functionOne();
	  } catch (Exception ex) {
	   System.out.println("4");
	  }
	 }

	}