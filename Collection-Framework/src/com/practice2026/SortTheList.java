package src.com.practice2026;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortTheList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(  );
        list.add("Deepak");
        list.add("Ramesh");
        list.add("Kunal");
        list.add("Pratik");
        list.add("Zaffar");
        list.add("Mayur");


        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        System.out.println(list);
    }
}
