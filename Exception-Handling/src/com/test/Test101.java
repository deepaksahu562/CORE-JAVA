package src.com.test;
class Test101
{
	public static void main(String args[])
	{	
		int i1=0;
		int i2=0;
		int i3=0;
	try{	
		i1=Integer.parseInt(args[0]);
		i2=Integer.parseInt(args[1]);
		i3=i1/i2;
		System.out.println(i3);
	}
	catch(Exception e){
		System.out.println("plz pass some value :"+e);
		e.getMessage();
	}
	}
}