package src.edu.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        playWithNumbers();
    }

    private static void playWithNumbers() {
        Integer[] numbersArray = {10, 15, 8, 49, 25, 98, 98, 32, 15, 10};
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 10);

        Stream<Integer> integerStream = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15, 10);
        Stream<Integer> numbersArray1 = Stream.of(numbersArray);
        Stream<Integer> stream = Arrays.stream(numbersArray);
        Stream<Integer> intStream = integerList.stream();

        //DUPLICATE VALUES
        //Set<Integer> set = new HashSet<Integer>();
        //integerStream.filter(value -> !set.add(value)).forEach(System.out::println);

        /*integerStream
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);*/

        //intStream.filter(value -> Collections.frequency(integerList, value)>1).forEach(System.out::println); //NOT WORKING



        //integerStream.forEach(System.out::println);
        //int sum = integerStream.mapToInt(Integer::intValue).sum(); // RECOMMENDED
        //int sum = integerStream.collect(Collectors.summingInt(Integer::intValue));
        //long sum = integerStream.collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        //System.out.println("Total is : "+ sum);

        //integerStream.reduce(Integer::sum).ifPresent(System.out::println);
        //integerStream.mapToInt(Integer::intValue).average().ifPresent(System.out::println);
        //boolean anyMatch = integerStream.mapToInt(Integer::intValue).anyMatch(v -> v == 10); System.out.println(anyMatch);
        //boolean allMatch = Stream.of(10, 10, 10, 10).allMatch(v -> v == 10); System.out.println(allMatch);



        //MAX & MIN VALUE
        //integerStream.max((v1, v2) -> v1 - v2).ifPresent(System.out::println);
        //integerStream.max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
        //integerStream.max(Integer::compareTo).ifPresent(System.out::println);
        //integerStream.reduce(Integer::max).ifPresent(System.out::println);

        //integerStream.min((v1, v2) -> v1 - v2).ifPresent(System.out::println);
        //integerStream.min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
        //integerStream.min(Integer::compareTo).ifPresent(System.out::println);
        //integerStream.reduce(Integer::min).ifPresent(System.out::println);


        //FIRST 4 NUMBER
        //integerStream.limit(4).forEach(System.out::println);

        //FIRST 4 NUMBER SORTING ASCENDING ORDER
        //integerStream.sorted().limit(4).forEach(System.out::println);

        //SORTED ORDER ASCENDING
        //Collections.sort(integerList); System.out.println(integerList);
        //integerStream.sorted().forEach(System.out::println);

        //SORTED ORDER DESCENDING
        //Collections.sort(integerList, (v1, v2) -> -(v1 - v2)); System.out.println(integerList);
        //Collections.sort(integerList, (v1, v2) -> v2 - v1); System.out.println(integerList);
        //Collections.reverse(integerList); System.out.println(integerList);    // NOT WORKING
        //Collections.reverseOrder(); System.out.println(integerList);          // NOT WORKING
        //Collections.reverseOrder((e1, e2) -> (int) ((int)e2 - (int)e1)); System.out.println(integerList); // NOT WORKING
        //integerStream.sorted(Collections.reverseOrder()).forEach(System.out::println);


    }
}
