package src.com.practice2026;

import java.util.*;

public class RemoveDuplicateEntryObjectFromHashSet {
    public static void main(String[] args) {
        Collection<Employee_2026_1001> c = new HashSet<>();
        populate(c);


        //System.out.println(c);

        /*for (Employee_2026_1001 emp : c){
            System.out.println(emp);
        }*/

        Iterator<Employee_2026_1001> it = c.iterator();
        while (it.hasNext()){
            Employee_2026_1001 emp = (Employee_2026_1001)it.next();
            System.out.println(emp);
        }

    }

    static void populate(Collection c){
        c.add(new Employee_2026_1001(105, "Deepak"));
        c.add(new Employee_2026_1001(102, "Mohit"));
        c.add(new Employee_2026_1001(105, "Deepak"));
        c.add(new Employee_2026_1001(104, "Ritik"));
        c.add(new Employee_2026_1001(108, "Deepak"));
        c.add(new Employee_2026_1001(104, "Hari"));

    }
}

class Employee_2026_1001 implements Comparable{
    private int id;
    private String name;

    public Employee_2026_1001(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (o instanceof Employee_2026_1001){
            Employee_2026_1001 emp = (Employee_2026_1001) o;
            return this.id == emp.getId() && this.name.equalsIgnoreCase(emp.getName()) ;
        }else return false;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        return result;
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
        return "Employee_2026_1001{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Employee_2026_1001) o).name);
       // return this.id-((Employee_2026_1001) o).id;
    }

}
