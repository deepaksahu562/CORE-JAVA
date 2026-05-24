package src.edu.stream.interviewQue;

import src.edu.stream.emp.Employees;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NthHighest {

    public static void main(String[] args) {

        Map<String, Integer> hm = new LinkedHashMap<>();
        populateMapData(hm);
        getNthHighestSalary2(hm, 2);

        /*Map<Integer, Employees> map = new HashMap<>();
        populateEmployeeMap(map);
        getNthHighestSalary(map, 2);*/
    }

    private static void getNthHighestSalary2(Map<String, Integer> hm, int n) {

        Map.Entry<Integer, List<String>> integerListEntry = hm.entrySet().stream()
                .collect(Collectors
                        .groupingBy(Map.Entry::getValue,
                                Collectors.mapping(Map.Entry::getKey,
                                        Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(n-1);

        System.out.println(integerListEntry);

    }

    private static void populateMapData(Map<String, Integer> hm) {
        hm.put("Preeti", 25500);
        hm.put("Sourabh", 65000);
        hm.put("Kiaran", 55500);
        hm.put("Shayam", 60500);
        hm.put("Bihari", 60500);
        hm.put("Ramakant", 25500);
        hm.put("Govind", 55500);
        hm.put("Rahul", 65000);
    }


    private static void populateEmployeeMap(Map<Integer, Employees> map) {

        map.put(1001, new Employees(1001, "Rahul", 28, 85000L));
        map.put(1005, new Employees(1005, "Ajay", 35, 95000L));
        map.put(1006, new Employees(1008, "Vineet", 55, 105000L));
        map.put(1004, new Employees(1012, "Pankaj", 44, 102000L));
        map.put(1002, new Employees(1035, "Sumit", 32, 155000L));
        map.put(1403, new Employees(1245, "Prateek", 22, 45000L));
        map.put(1301, new Employees(1001, "Kumar", 28, 85000L));
        map.put(1205, new Employees(1005, "Sachin", 35, 95000L));
        map.put(1106, new Employees(1008, "Bihari", 55, 105000L));
        map.put(1304, new Employees(1012, "Arvind", 44, 102000L));
        map.put(1202, new Employees(1035, "Kiran", 32, 155000L));
        map.put(1103, new Employees(1245, "Pream", 22, 45000L));
    }

    private static void getNthHighestSalary(Map<Integer, Employees> map, int n) {

        Function<Map.Entry<Integer,Employees>, Long> function = (entry) ->{

            return entry.getValue().getSalary();
        };

        Map.Entry<Long, List<String>> longListEntry = map.entrySet().stream()
                .collect(Collectors
                        .groupingBy(entry -> entry.getValue().getSalary(),
                                Collectors.mapping(entry -> entry.getValue().getEmpName(),
                                        Collectors.toList())))
                .entrySet().stream()
                .sorted((entry1, entry2) -> (int) (entry2.getKey() - entry1.getKey()))
                .collect(Collectors.toList()).get(n - 1);

        System.out.println(longListEntry);

    }
}
