package src.edu.stream.emp;

import java.util.*;
import java.util.stream.Collectors;

public class EmpStreams {

    public static void main(String[] args) {
        List<Employees> empList = new ArrayList<>();
        empList.add(new Employees(1001, "Rahul", 28, 85000L));
        empList.add(new Employees(1005, "Ajay", 35, 95000L));
        empList.add(new Employees(1008, "Vineet", 55, 105000L));
        empList.add(new Employees(1012, "Pankaj", 44, 102000L));
        empList.add(new Employees(1035, "Sumit", 32, 155000L));
        empList.add(new Employees(1245, "Prateek", 22, 45000L));

        accumulater(empList);
        //new EmpStreams().shortBySalary(empList);
        //secondHighestSalary(empList);
        //covertIntoMapWithIdAndName(empList);
        //showEmpsWithAageGraterThan(empList);

    }

    private static void accumulater(List<Employees> list){
        OptionalDouble optionalDouble = list.stream()
                .filter(emp -> emp.getAge() <= 35)
                .mapToDouble(Employees::getSalary)
                .reduce((a,b) -> a + b);
        double totalSalary = optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0.0;
        //double totalSalary = list.stream().filter(emp -> emp.getAge() <= 35).mapToDouble(Employees::getSalary).sum();
        System.out.println(totalSalary);

        double averageSalary = list.stream().filter(emp -> emp.getAge() <= 35).mapToDouble(Employees::getSalary).average().getAsDouble();
        //System.out.println(averageSalary);

        // MAX Salary
        OptionalLong reduce = list.stream()
                .mapToLong(emp -> emp.getSalary())
                .reduce((e1, e2) -> e1 > e2 ? e1 : e2);
        if (reduce.isPresent()){
            long asLong = reduce.getAsLong();
            //System.out.println(asLong);
        }

    }

    private void shortBySalary(List<Employees> empList){
        //empList.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).forEach(System.out::println);
        //empList.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println); // ASCENDING
        //empList.stream().sorted(Comparator.comparing(emp -> - emp.getSalary())).forEach(System.out::println); // DESCENDING
        empList.stream().sorted(Comparator.comparing(Employees::getSalary)).forEach(System.out::println);
    }

    private static void covertIntoMapWithIdAndName(List<Employees> empList) {

        Map<Integer, String> map = empList.stream().collect(Collectors.toMap(Employees::getEmpId, Employees::getEmpName));

        map.entrySet().stream().forEach(data -> System.out.println(data.getKey()+" : "+data.getValue()));
        //map.entrySet().forEach(data -> System.out.println(data.getKey()+" : "+data.getValue()));
        //map.entrySet().forEach(System.out::println);
    }

    private static void secondHighestSalary(List<Employees> empList) {

        Employees emp = empList.stream().sorted((emp1, emp2) -> (int) (emp2.getSalary() -  emp1.getSalary())).skip(1).findFirst().get();
        System.out.println(emp);
    }

    private static void showEmpsWithAageGraterThan(List<Employees> empList){

        empList.stream()
                .filter(emp -> emp.getAge() > 30)
                .sorted((emp1, emp2) -> emp2.getEmpName().compareTo(emp1.getEmpName()))
                .forEach(System.out::println);

    }

}


