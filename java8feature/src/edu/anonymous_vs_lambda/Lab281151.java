package src.edu.anonymous_vs_lambda;

interface Interaf281151{
    public void war();
}

public class Lab281151 {
    int a = 888;
    int b = 555;
    public void display(){

        // with anonymous inner class
        System.out.println("------- with anonymous inner class ---------");
        Interaf281151 interaf281151 = new Interaf281151() {
            int a = 999;
            @Override
            public void war() {
                System.out.println(this.a);
                //System.out.println(this.b);
                System.out.println(a);
            }
        } ;
        interaf281151.war();

        // with lambda expression
        System.out.println("------- with lambda expression ---------");
        Interaf281151 interaf2811511a = () ->{
          int a = 777;
            System.out.println(this.a);
            System.out.println(this.b);
            System.out.println(a);
        };
        interaf2811511a.war();
    }

    public static void main(String[] args) {

        Lab281151 lab281151 = new Lab281151();
        lab281151.display();

    }
}
