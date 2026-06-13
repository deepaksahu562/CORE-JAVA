package src.edu._2026.ivq;

import java.util.HashSet;
import java.util.Set;

public class DisplayRepeatedChar {
    public static void main(String[] args) {

        String str = "hyderabad"; //ad
        Set<Character> set = new HashSet<>();

        repeatedCharUsingJava8Stream(str, set);
        repeatedCharUsingCoreJava(str, set);
    }

    private static void repeatedCharUsingCoreJava(String str, Set<Character> set) {
        /*With core java*/
        char[] charArray = str.toCharArray();
        String result = "";
        for (char chr : charArray) {
            //result = (!set.add(chr))? result + chr : "";
            result += (!set.add(chr)) ? chr : "";
        }
        System.out.println(result);
    }

    private static void repeatedCharUsingJava8Stream(String str, Set<Character> set) {
        /*With java 8 stream API*/
        //IntStream chars = str.chars();
        str.chars()
                .mapToObj(value -> (char) value)
                .filter(value -> !set.add(value))
                .forEach(System.out::print);
    }
}
