package src.com.interview.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "aabbcddeffg";

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
