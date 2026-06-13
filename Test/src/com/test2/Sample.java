package src.com.test2;

import java.util.*;

public class Sample {
public static void main(String arg[]) {
 Integer i = 10;
 String s = "ABC";
 List<String> list = new ArrayList<String>();
 list.add(s);
 method1(i);
 method2(list);
 System.out.println(i);
 System.out.println(list.size());
}

public static void method1(Integer i) {
 i = 87;
}


public static void method2(List<String> list) {
 list.add("new String");
}
}