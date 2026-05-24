package src.edu.optional_check;

import java.util.ArrayList;
import java.util.List;

public class OptionalCheck {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Agara");
        list.add("Bangalore");
        //list.add(null);
        list.add("Mumbai");
        //list.add(null);
        list.add("Pune");
        list.add("Bangalore");

        String deepak = list.stream().reduce("Deepak", String::concat);
        System.out.println(deepak);
    }
}
