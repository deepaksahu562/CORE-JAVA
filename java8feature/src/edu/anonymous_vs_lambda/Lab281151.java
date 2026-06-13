package src.edu.anonymous_vs_lambda;

interface Interaf281151{
    public void war();
}

public class Lab281151 {
    int a = 888;
    int b = 555;

    public void display(){
        int c = 222;
        // int a = 666;
        // with anonymous inner class
        System.out.println("------- with anonymous inner class ---------");
        Interaf281151 interaf281151 = new Interaf281151() {
            int a = 999;
            @Override
            public void war() {
                System.out.println(this.a);
                //System.out.println(this.b);
                System.out.println(a);
                //c = c + 1; //Variable 'c' is accessed from within inner class, needs to be final or effectively final
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
            //c = c+1; //Variable 'c' is accessed from within inner class, needs to be final or effectively final
        };
        interaf2811511a.war();
    }

    public static void main(String[] args) {

        Lab281151 lab281151 = new Lab281151();
        lab281151.display();

    }
}
