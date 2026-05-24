package src.com.test;
class Door implements AutoCloseable
{
	Door()
	{
		System.out.println("Open Door");
	}
	public void close()
	{
		System.out.println("Door is closed");
	}
}

class Window implements AutoCloseable
{
	Window()
	{
		System.out.println("Open Window");
	}
	public void close()
	{
		System.out.println("Window is closed");
	}
}

public class Test107
{
	public static void main(String args[])
	{
		try(Door dr=new Door();Window wd=new Window()){
			System.out.println("Test of custom Resource from JDK1.7");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}