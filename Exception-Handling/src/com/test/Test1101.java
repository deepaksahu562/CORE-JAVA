package src.com.test;
public class Test1101
{
	public static void main(String args[])
	{
		System.out.println(decision());
	}
	static boolean decision()
	{
		try{
			return true;
		}finally{
			return false;
		}
	}
}