package edu.inv;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Inv108 {


    public static void main(String []args){
        List<Employeee> Employeees=getEmployeeeList();
        
        Map map = Employeees.stream().collect(Collectors.toMap(Employeee::getName, Employeee::getSalary));
        System.out.println(map);
        
    }
    public static List<Employeee> getEmployeeeList(){
        return Arrays.asList(
            new Employeee ("Sumit",25,26000,"Pune","Maharashtra"),
            new Employeee ("Mohan",20,23000,"Bhopal","Madhya Pradesh"),
            new Employeee ("Naina",26,25000,"Delhi","Delhi"),
            new Employeee ("Sachin",35,28000,"Kolkata","West Bengal"),
            new Employeee ("Rahul",45,33300,"Bangalore","Karnatka"),
            new Employeee ("Saurav",60,45000,"Kochhi","Kerala"),
            new Employeee ("Nidhi",48,38000,"Pathankot","Himachal Pradesh"),
            new Employeee ("Pooja",29,88000,"Lucknow","Uttar Pradesh"));
    }

    //Person::getName,
    //Person::getAddress,
    //(s, a) -> s + ", " + a));
	
}

class Employeee {
    private String name;
    private int age;
    private double salary;
    private String city;
    private String state;
    public Employeee(String name, int age,double salary, String city, String state){
        this.name =name;
        this.age =age;
        this.salary =salary;
        this.city =city;
        this.state =state;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	};
    
    

}