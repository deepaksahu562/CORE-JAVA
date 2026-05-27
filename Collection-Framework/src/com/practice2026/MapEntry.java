package src.com.practice2026;

import java.util.*;
import java.util.TreeMap;

public class MapEntry {
    public static void main(String[] args) {
        Map<Integer, Student_2026_1002> map = new TreeMap<>();
        populate(map);

        //option A
        Set<Integer> integers = map.keySet();
        /*Iterator<Integer> iterator1 = integers.iterator();
        while (iterator1.hasNext()) {
            Integer next =  iterator1.next();
            System.out.println(next);

        }*/

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        // option B
        Set<Map.Entry<Integer, Student_2026_1002>> set =  map.entrySet();
        /*Iterator<Map.Entry<Integer, Student_2026_1002>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey() +" : "+entry.getValue());

        }*/

        /*for (Map.Entry<Integer, Student_2026_1002> integerStudent20261002Entry : set) {
            //System.out.println(integerStudent20261002Entry.toString());
            System.out.println(integerStudent20261002Entry.getValue().toString());
        }*/

        // option C
        /*for (Map.Entry<Integer, Student_2026_1002> integerStudent20261002Entry : map.entrySet()) {
            System.out.println(integerStudent20261002Entry.toString());
            //System.out.println(integerStudent20261002Entry.getValue().toString());
        }*/

    }

    static void populate(Map<Integer, Student_2026_1002> map){
        map.put(11, new Student_2026_1002(101, "Rahul"));
        map.put(15, new Student_2026_1002(105, "Sanjana"));
        map.put(12, new Student_2026_1002(102, "Palak"));
        map.put(16, new Student_2026_1002(106, "Ankit"));
        map.put(11, new Student_2026_1002(101, "Sabita"));

    }
}

class Student_2026_1002{
    private int id;
    private String name;

    public Student_2026_1002(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student_2026_1002{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
