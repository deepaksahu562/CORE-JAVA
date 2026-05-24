package src.edu.stream.api;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperationWithString {

    public static void main(String[] args) {

        String str = "DeepakKumarSahu";
        //findCountPerChar(str);
        //firstRepeated(str);
        //firstNonRepeated(str);
    }

    private static void firstNonRepeated(String str) {

        str.chars().mapToObj(s -> Character.toLowerCase((char)s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey()).findFirst().ifPresent(System.out::println);
    }

    private static void firstRepeated(String str) {

        str.chars()
                //.mapToObj(Character::toString).map(String::toLowerCase)
                //.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .mapToObj(s -> Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst().ifPresent(System.out::println);
    }

    private static void findCountPerChar(String s) {

        /*Map<String, Long> map = s.chars().mapToObj(Character::toString).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

        /*Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));*/

        /*Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors
                        .groupingBy(str -> str,
                                LinkedHashMap::new, Collectors.counting()));*/


        /*Map<String, Long> map = s.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));*/

        //System.out.println(map);

    }
}
