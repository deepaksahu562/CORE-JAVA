package src.com.overriding.test;
class Animal
{
	void eating()
	{
		System.out.println("eating in Animal");
	}
	
	public void sleeping()
	{
		System.out.println("sleeping in Animal");
	}

	static void walking()
	{
		System.out.println("walking in Animal");
	}
}

class Dog extends Animal
{
	public void sleeping()
	{
		System.out.println("sleeping in Dog");
	}
	
	void barking()
	{
		System.out.println("barking in Dog");
	}

	static void walking()
	{
		System.out.println("walking in Dog");
	}
/*
	void eating()
	{
		System.out.println("eating in Dog");
	}
*/
}
class Cat extends Animal
{
	public void sleeping ()
	{
		System.out.println("sleeping in Cat");
	}	
		
	static void walking()
	{
		System.out.println("walking in Cat");
	}

	void drinking()
	{
		System.out.println("Drinking in Cat");
	}
}
class Test71
{
	public static void main(String args[])
	{
		Animal ani1=new Animal();
		Animal ani2=null;

		Dog d1=new Dog();
		d1.eating();

		ani2=new Dog();
		ani2.eating();
		

		ani2.sleeping();
		d1.sleeping();
		

		ani2.walking();
		d1.walking();

		//ani2.barking();// In dynamic case m() must be avilable in super class also
		d1.barking();
		d1.walking();

		//ani2=new Cat();
		//ani2.eating();
		//ani2.sleeping();
		System.out.println("---1-----");
		ani2.walking();
		//ani2.drinking();//

		//Cat cat=new Cat();
		//cat.drinking();
	}
}