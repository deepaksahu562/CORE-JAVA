package src.edu.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        /*Stream stm1 = list1.stream();
        Stream stm2 = list2.stream();
        Stream concatStream  = Stream.concat(stm1, stm2);*/

        Stream concatStream  = Stream.concat(list1.stream(), list2.stream());
        concatStream .forEach(System.out::println);


    }
}
