package src.com.test2;


public class IsEqual {

static void someMethod() {

 String str1 = "hello";
 String str2 = new String("hello");

 System.out.println(str1 != str2);
 System.out.println(str1.equals(str2));
}

public static void main(String str[]) {

 someMethod();

}
}

