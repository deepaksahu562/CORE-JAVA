package src.edu.stream.interviewQue;

import src.edu.stream.emp.Employees;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions {

    public static void main(String[] args) {

        String[] strArr = {"Indore", "Shahdol", "Pune", "Bhuvaneshwaver"};
        //displayLongestString(strArr);

        String str = "DeepakKumarSahu";
        //countOccurrenceOfEachChar(str);
        //displayDuplicateChar(str);
        //displayNonRepeatableChar(str);
        //displayFirstNonRepeatableChar(str);
        //displayFirstRepeatableChar(str);

    }



    static void displayLongestString(String[] strArr) {
        Optional<String> reduce = Arrays.stream(strArr).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
        reduce.ifPresent(System.out::println);
    }

    static void displayFirstRepeatableChar(String str) {
        Optional<String> first = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).findFirst();

        first.ifPresent(System.out::println);
    }

    static void displayFirstNonRepeatableChar(String str) {
        Optional<String> first = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).findFirst();

        first.ifPresent(System.out::println);
    }

    static void displayNonRepeatableChar(String str) {
        List<String> collect = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    static void displayDuplicateChar(String str) {
        List<String> collect = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    static void countOccurrenceOfEachChar(String str) {
        Map<String, Long> map = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        System.out.println("***********");
        map.entrySet().stream().filter(entry -> entry.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
