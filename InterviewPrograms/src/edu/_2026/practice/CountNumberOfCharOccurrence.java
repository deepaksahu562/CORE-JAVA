package src.edu._2026.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfCharOccurrence {
    public static void main(String[] args) {
        String str = "deepakkumarsahu";
        frequencyUsingJava8StreamAPI(str);
        //frequencyUsingCoreJava(str);
    }

    private static void frequencyUsingJava8StreamAPI(String str) {
        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    private static void frequencyUsingCoreJava(String str) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.add(str.charAt(i))){
                map.put(str.charAt(i), 1 );
            }else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            //map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
        }
        System.out.println(map);
    }


}
