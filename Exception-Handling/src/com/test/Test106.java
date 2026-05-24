package src.com.test;
import java.io.*;

public class Test106
{
	public static void main(String args[])throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("abc.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			DataOutputStream dos=new DataOutputStream(bos)){
			dos.writeUTF("Hidfsdfsdfsdfsf");
			System.out.println("Before jdk-1.7");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}