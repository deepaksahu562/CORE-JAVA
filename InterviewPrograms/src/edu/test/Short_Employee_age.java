package src.edu.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Short_Employee_age {
    public static void main(String[] args) {

        List<Employee> emplList = new ArrayList<>();
        emplList.add(new Employee("Deepak", 34));
        emplList.add(new Employee("Ramesh", 41));
        emplList.add(new Employee("Rahul", 54));
        emplList.add(new Employee("Aman", 24));


        //emplList.stream().map(emp -> emp.age).sorted((age1, age2) -> (age2- age1) ).forEach(System.out::println);
        List<Employee> collect = emplList.stream().sorted((emp1, emp2) -> (emp2.age - emp1.age)).collect(Collectors.toList());
        System.out.println(collect);


    }
}


class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
