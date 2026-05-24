package src.edu.interface_default_static;


abstract class AbstractClass{    
    public AbstractClass() {        // constructor    
        System.out.println("You can create constructor in abstract class");    
    }    
    abstract int add(int a, int b); // abstract method
    int sub(int a, int b){      // non-abstract method    
        return a-b;    
    }    
    static int multiply(int a, int b){  // static method    
        return a*b;    
    }    
}    
public class Lab281132 extends AbstractClass{    
    public int add(int a, int b){        // implementing abstract method    
        return a+b;    
    }    
    public static void main(String[] args) {    
    	Lab281132 a = new Lab281132();    
        int result1 = a.add(20, 10);    // calling abstract method    
        int result2 = a.sub(20, 10);    // calling non-abstract method    
        int result3 = AbstractClass.multiply(20, 10); // calling static method   
        int result4 = a.multiply(40, 10);
        System.out.println("Addition: "+result1);    
        System.out.println("Substraction: "+result2);    
        System.out.println("Multiplication: "+result3);    
        System.out.println("Multiplication: "+result4);    
    }    
}    
