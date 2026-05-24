package src.com.jlc2015;

import java.util.*;

public class Compable_Comparator {

	public static void main(String[] args) {
		
		//List<Object> list = new ArrayList<Object>();
		Set<Employee> list = new TreeSet<Employee>(new EmployeeComp()); 
		list.add(new Employee(101, "Deepak", "Shahdol"));
		list.add(new Employee(104, "Bhuvan", "Khandwa"));
		list.add(new Employee(102, "Paras", "Mansor"));
		list.add(new Employee(103, "Bhaskar", "indore"));
		//System.out.println(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}
}

class Employee implements Comparable<Object>{
	int id;
	String name;
	String city;
	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Employee) {
			Employee emp = (Employee)obj;
			return this.id - emp.id;
			//return this.name.compareToIgnoreCase(emp.name);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return ""+id+"\t"+name+"\t"+city;
	}
}

class EmployeeComp implements Comparator<Object>{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 instanceof Employee && obj2 instanceof Employee) {
			Employee emp1 = (Employee)obj1;
			Employee emp2 = (Employee)obj2;
			//return emp1.id - emp2.id;
			return emp1.name.compareToIgnoreCase(emp2.name);
		}
		return 0;
	}
}
