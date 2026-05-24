package src.edu.prectice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaDemo {
public static void main(String[] args) { 
// Creating List and adding Employees values.
List<Employee> employeesList = new ArrayList<>(); 
employeesList.add(new Employee("Glady", "Manager"));
employeesList.add(new Employee("Vlad", "Software Engineer"));
employeesList.add(new Employee("Shine", "Lead Engineer"));
employeesList.add(new Employee("Nike", "Software Engineer"));
employeesList.add(new Employee("Slagan", "Software Engineer"));
employeesList.add(new Employee("Murekan", "Software Engineer"));
employeesList.add(new Employee("Gagy", "Manager")); 
employeesList.add(new Employee("Gagy", "Software Engineer"));
//System.out.println("employeesList=="+employeesList);
System.out.println("Please start coding");
// output : {Software Engineer=4, Manager=2, Lead Engineer=1}
// nameList==[Glady, Vlad, Shine, Nike, Slagan, Murekan, Gagy, Gagy]
// CODE HERE



/*// 1.2 print original List to console
List<String> companies = employeesList.stream().map(data -> data.getDesignation()).collect(Collectors.toList());
//2. get duplicate count using Map
Map<String, Integer> duplicateCountMap = companies
        .stream()
        .collect(
                Collectors.toMap(Function.identity(), company -> 1, Integer::sum)
                );


// 2.1 print Map for duplicate count
System.out.println("\n2. Map with Key and its duplicate count : \n");
duplicateCountMap.forEach(
        (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
        );*/

employeesList.stream()
			.map(data -> data.getDesignation()).collect(Collectors.toList())
			.stream().collect(Collectors.toMap(Function.identity(), company -> 1, Integer::sum))
			.forEach((key, value) -> System.out.println( key + " : " + value));

/*employeesList.stream().map(data -> data.getDesignation())
.filter(value -> value.equals(anObject)).collect(Collectors.toSet()).forEach(S);*/
	
}

}

	// select designation, cout(*) Employee where count



class Employee {
	private String name;
	private String designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "\n{name=" + name + ", designation=" + designation + "}";
	}
}