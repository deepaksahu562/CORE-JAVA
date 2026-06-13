package src.com.test2;
class Parent {

public Parent() {
 System.out.println("Parent 0 argument");
}

public Parent(String dummy) {
 System.out.println("Parent 1 argument");
}
}

public class Child extends Parent {

public Child() {
 System.out.println("Child 0 argument");
}

public Child(String dummy) {
 System.out.println("Child 1 argument");
}

public static void main(String[] args) {
 new Child("String");
}
}