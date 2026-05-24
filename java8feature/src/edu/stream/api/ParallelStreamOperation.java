package src.edu.stream.api;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamOperation {
    public static void main(String[] args) {
        display();
    }

    static void display() {
        IntConsumer consumer = value -> {
            System.out.println(value + "  " + Thread.currentThread().getName());
        };
        //IntStream.range(1, 100).forEach(consumer);
        IntStream.range(1, 10000).parallel().forEach(consumer);
    }

    static void show() {
        Predicate<Integer> predicate = value -> {
            System.out.println(Thread.currentThread().getName());
            return value % 2 == 0;
        };

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(predicate).forEach(System.out::println);
        System.out.println("***********************");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).parallel().filter(predicate).forEach(System.out::println);
    }
}
