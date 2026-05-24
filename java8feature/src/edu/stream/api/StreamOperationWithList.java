package src.edu.stream.api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperationWithList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Indore");
        list.add("Agara");
        list.add("Bangalore");
        list.add("Pune");
        list.add("Mumbai");
        list.add("Agara");
        list.add("Pune");
        list.add("Bangalore");

        //list.forEach(System.out::println);

        long cout = list.stream().filter(str -> str.length() > 5).count();
        //System.out.println(cout);

        List<String> list2 = list.stream().filter(str -> str.length() > 5).collect(Collectors.toList());
        //System.out.println(list2);

        List<String> list4 = list.stream().filter(str -> str.length() > 5).distinct().collect(Collectors.toList());
        //System.out.println("Dist"+list4);

        long cout2 = list.stream().map(str -> str.toUpperCase()).count();
        //System.out.println(cout2);

        List<String> list3 = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        //System.out.println(list3);

        List<String> list5 = list.stream().distinct().collect(Collectors.toList());
        //System.out.println(list5);

        List<String> list6 = list.stream().limit(2).collect(Collectors.toList());
        //System.out.println(list6);

        List<String> list7 = list.stream().skip(2).collect(Collectors.toList());
        //System.out.println(list7);

        //String str1 = list.stream().min((data1, data2) -> data1.compareTo(data2)).get();
        String str1 = list.stream().min((data1, data2) -> data1.length() - data2.length()).get();
        System.out.println(str1);

        //String str2 = list.stream().max((data1, data2) -> data1.compareTo(data2)).get();
        String str2 = list.stream().max((data1, data2) -> data1.length() - data2.length()).get();
        //System.out.println(str2);

        boolean flag1 = list.stream().noneMatch(str -> str.length() == 55);
        //System.out.println(flag1);

        boolean flag2 = list.stream().anyMatch(str -> str.length() == 5);
        //System.out.println(flag2);

        boolean flag3 = list.stream().allMatch(str -> str.length() > 2);
        //System.out.println(flag3);

        String str3 = list.stream().findFirst().get();
        //System.out.println(str3);

        //list.clear();
        Optional<String> opt = list.stream().findAny();
        //opt.ifPresent(System.out::println);
        //System.out.println(opt);
        if (opt.isPresent()) {
            //System.out.println(opt.get());
        }

        String str4 = list.stream().findAny().get();
        //System.out.println(str4);

        Object [] data = list.stream().toArray();
        for (Object obj : data) {
            //System.out.println(obj.toString());
        }

        Map<String,Long> namesCount = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(namesCount);

        Map<String,Long> frequency = list.stream()
                .filter(x -> Collections.frequency(list, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(frequency);
        //System.out.println(Collections.frequency(list, "Agara"));


    //TERMINAL_OPERATION - FOREACH
    /*list.stream().map(str ->str.toUpperCase()).forEach(System.out::println);
        System.out.println("-------");
    list.stream().map(str ->str.toUpperCase()).forEachOrdered(System.out::println);*/

    }
}