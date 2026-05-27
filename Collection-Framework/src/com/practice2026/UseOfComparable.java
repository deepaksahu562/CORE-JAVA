package src.com.practice2026;

import java.util.Set;
import java.util.TreeSet;

public class UseOfComparable {
    public static void main(String[] args) {
        Set<Employee_2026_1001> set = new TreeSet<>();
        RemoveDuplicateEntryObjectFromHashSet.populate(set);

        for (Employee_2026_1001 employee20261001 : set) {
            System.out.println(employee20261001);
        }
    }
}
