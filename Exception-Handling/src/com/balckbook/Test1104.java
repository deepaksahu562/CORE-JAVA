package src.com.balckbook;

interface Type1
{
	void f()throws CloneNotSupportedException;
}
interface Type2
{
	void f()throws InterruptedException;
}

interface Type3 extends Type1,Type2{
	
}

/*class Type4{
	void f()throws InterruptedException{
		System.out.println("hai");
	}
}
*/
public class Test1104 implements Type3
{
	public void f()
			
	{
		System.out.println("Hello world");
	}

	public static void main(String args[])
	{
		Test1104 t3=new Test1104();
		t3.f();
	}
}

