package com.test;

abstract class Animal
{
	abstract void eating();
	//abstract void sleeping();
}

class welcomeAnimal
{
	Animal ani=new Animal()
	{
	
		void eating()
		{
			System.out.println("Eating in welcomeAnimal");
		}

		{
			System.out.println("IB in welcomeAnimal");
		}

		void sleeping()
		{
			System.out.println("sleeping in welcomeAnimal");
		}
	};

	void testAnimal()
	{
		System.out.println("testAnimal in welcomeAnimal");
		Animal ani1=new Animal()
		{
			void eating()
			{
				System.out.println("eating in testAnimal");
			}
		};

		ani1.eating();
	}//TestAnimal end

	void testAgain()
	{
		System.out.println("testAgain in welcomeAnimal");
		ani.eating();
		//ani.sleeping();
		testAnimal();
	}

	Animal finalTest()	{
		System.out.println("FinalTest");
		Animal ani2=new Animal()
		{
			void eating()
			{
				System.out.println("Eating in finalTest");
			}
		};
		//return ani2;

		return new Animal()
		{
			void eating()
			{
				System.out.println("eating in finalTest");
			}
		};
	}
	
	void testAll()
	{
		System.out.println("testAll");
		Animal ani3=finalTest();
		ani3.eating();
	}
}


interface I1
{
	public abstract void drinking();
}

class Cat
{
	I1 i1=new I1()
	{
		public void drinking()
		{
			System.out.println("drinking in Cat");
		}

		{System.out.println("ib hi");}
	};

	I1 testCat()	{
		return new I1()
		{	
			public void drinking()
			{
				System.out.println("Drinking in testCat");
			}
		};
	}
	
	
	void testAllCat()
	{
		System.out.println("testAllCat");
		I1 i1=testCat();
		i1.drinking();
		this.i1.drinking();
	}

}




public class Test84
{
	public static void main(String args[])
	{
		welcomeAnimal wa=new welcomeAnimal();
		System.out.println("-----------------");
		wa.testAll();
		System.out.println("-----------------");
		wa.ani.eating();
		System.out.println("-----------------");
		Animal ani=wa.finalTest();
		ani.eating();
		System.out.println("=================");
		Cat cat=new Cat();
		cat.testAllCat();
		System.out.println("-----------------");
		cat.i1.drinking();
	}
}