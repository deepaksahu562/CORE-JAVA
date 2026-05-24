package src.edu.stream.api;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationWithNumber {
    public static void main(String args[]) {
        //display();
        show();
    }

    static void display(){
        Integer[] nums = {10, 15, 8, 49, 25, 98, 98, 32, 15, 10};
        //Arrays.stream(nums).max((a,b) -> a - b).ifPresent(System.out::println);.
        //Arrays.stream(nums).max(Integer::compareTo).ifPresent(System.out::println);
        Stream.of(nums).max(Integer::compareTo).ifPresent(System.out::println);

        int[] numss = {10, 15, 8, 49, 25, 98, 98, 32, 15, 10};
        Arrays.stream(numss)
                .boxed()// Convert primitive to Wrapper Object
                .max(Integer::compareTo).ifPresent(System.out::println);
    }

    static void show(){
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 10);

        /** EvenNumber */
        //list.stream().filter(data -> data % 2 == 0).forEach(System.out::println);

        /** NumberStartingWithOne */
        //list.stream().filter(data -> data.toString().startsWith("1")).forEach(System.out::println);

        /** DuplicateElements */
        //Set set = new HashSet();
        //list.stream().filter(data -> !set.add(data)).forEach(System.out::println);

        /** FindFirstElement */
        //list.stream().findFirst().ifPresent(System.out::println);

        /** FindMaxElement */
        //list.stream().max((a,b) -> a - b).ifPresent(System.out::println);
        //list.stream().max((a,b) -> a.compareTo(b)).ifPresent(System.out::println);
        //list.stream().max(Integer::compare).ifPresent(System.out::println);

        /** ascending SortValues */
        /*Collections.sort(list);
        System.out.println(list);*/
        //list.stream().sorted().forEach(System.out::println);

        /** descending SortValues */
        //Collections.sort(list, (a,b) -> b.compareTo(a));
        //Collections.sort(list, Comparator.reverseOrder());
        //Collections.reverse(list); // X
        //System.out.println(list);

        /*list.sort(Comparator.reverseOrder());
        System.out.println(list);*/

        //list.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);
        //list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}