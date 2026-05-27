package src.com.practice2026;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseOfComparator {
    public static void main(String[] args) {
        //Set<Employee_2026_1001> set = new TreeSet<>(new MyComparator());
        //Set<Employee_2026_1001> set = new TreeSet<>((o1, o2) -> o2.getId() - o2.getId());
        Set<Employee_2026_1001> set = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));


        RemoveDuplicateEntryObjectFromHashSet.populate(set);

        for (Employee_2026_1001 employee20261001 : set) {
            System.out.println(employee20261001);
        }
    }
}

class MyComparator implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        int returnvalue = 0;
        if (o1 instanceof  Employee_2026_1001 && o2 instanceof Employee_2026_1001){
            Employee_2026_1001 emp1 = (Employee_2026_1001) o1;
            Employee_2026_1001 emp2 = (Employee_2026_1001) o2;

            returnvalue = emp2.getId()-emp1.getId();
            //returnvalue = emp1.getName().compareToIgnoreCase(emp2.getName());
        }
        return returnvalue;
    }
}
