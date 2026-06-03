package src.edu.lambda;


interface Infra201125 {
    public void show();
}
public class Lab201125 {

    int x = 777;

    public void display() {
        int y = 555;
        int m = 222;
        Infra201125 infra = () -> {
            int x = 888;
            System.out.println(x);
            System.out.println(y);
            System.out.println(this.x);
            //y=999;
            //m=111;
        };
        infra.show();
    }

    public static void main(String[] args) {
        Lab201125 lab = new Lab201125();
        lab.display();

    }

}
