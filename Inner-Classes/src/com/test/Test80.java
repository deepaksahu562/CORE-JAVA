package src.com.test;
/*
class Outer
{
        interface I1
        {
                int a=10;
                void m1();
        }
        interface I2
        {
                public static final int b=20;
                public abstract void m2();
        }
        abstract class Inner1 implements I1,I2
        {
                public void m1()
                {
                        System.out.println("m1 in Inner1");
                }
                //abstract void dis();
        }
        class Inner2 extends Inner1
        {
                public void m2()
                {
                        System.out.println("m2 in Inner2");
                }
                void m3()
                {
                        System.out.println("m3 in Inner2");
                }
        }
        void show()
        {
                System.out.println("show in Outer");
                I1 i1=null;
                I2 i2=null;
                i1=new Inner2();
                i2=new Inner2();
                i1.m1();
                //i1.m2();
                i2.m2();
                //i2.m1();
                //i2.m3();
                Inner2 inr2=new Inner2();
                inr2.m3();
        }
}

public class Test80
{
        public static void main(String args[])
        {
        	Outer otr=new Outer();
        	Outer.I1 oi1=null;
        	oi1=new Outer().new Inner2();
        	//oi1.m2();
        	oi1.m1();
        	Outer.I2 oi2=otr.new Inner2();
        	oi2.m2();
        	//oi2.m1();
        	otr.show();
        }
}
*/