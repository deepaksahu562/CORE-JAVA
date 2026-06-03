package src.inv;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "aabbcddeffg";
        program(input);
        //programWithDraived(input);
    }


    public static void programWithDraived(String input){
        LinkedHashMap<Character, Long> result = input.chars() // IntStream of character codes
                .mapToObj(c -> (char) c) // Convert to Character stream
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // maintain insertion order
                        Collectors.counting()
                ));
        System.out.println(result);

        Character[] charsArray = {'a','b'};
        Stream charsArray1 = Stream.of(charsArray);
        charsArray1.forEach(System.out::println);


    }

    public static void program(String input){
        Character result = input.chars() // IntStream of character codes
                .mapToObj(c -> (char) c) // Convert to Character stream
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // maintain insertion order
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1) // filter for unique characters
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        if (result != null) {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}

