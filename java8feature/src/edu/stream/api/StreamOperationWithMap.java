package src.edu.stream.api;

import src.edu.stream.emp.Employees;

import java.util.*;

public class StreamOperationWithMap {
    public static void main(String[] args) {

        operationWithCustomObjects();

    }

    static void operationWithCustomObjects(){
        Map<Integer, Employees> map = new HashMap<>();
        map.put(1001, new Employees(1001, "Rahul", 28, 85000L));
        map.put(1005, new Employees(1005, "Ajay", 35, 95000L));
        map.put(1006, new Employees(1008, "Vineet", 55, 105000L));
        map.put(1004, new Employees(1012, "Pankaj", 44, 102000L));
        map.put(1002, new Employees(1035, "Sumit", 32, 155000L));
        map.put(1003, new Employees(1245, "Prateek", 22, 45000L));

        //map.entrySet().stream().sorted(Map.Entry.comparingByKey(((o1, o2) -> (int)o1 - (int)o2))).forEach(System.out::println);
        //map.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o1.getAge() - o2.getAge())).forEach(System.out::println);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employees::getSalary))).forEach(System.out::println); // ASCENDING
        System.out.println("****************");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employees::getSalary).reversed())).forEach(System.out::println); // DESCENDING
    }

    static void operationWithObjects(){
        Map<String, Integer> hm = new LinkedHashMap<>();
        hm.put("one", 1);
        hm.put("four", 4);
        hm.put("eight", 8);
        hm.put("six", 6);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("five", 5);
        hm.put("seven", 7);
        //System.out.println(hm);

        //Set<Map.Entry<String, String>> set = hm.entrySet();
        //hm.entrySet().stream().sorted(((o1, o2) -> o1.getKey().compareTo(o2.getKey()))).forEach(System.out::println);
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("************");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
