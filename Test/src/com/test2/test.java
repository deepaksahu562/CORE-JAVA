package src.com.test2;

public class test {
 public static void main(String [] a) {
	 try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");
     }catch (ClassNotFoundException e)
     {
         e.printStackTrace();
     }
 }
}

