package com.jlc2015;

public class Lab1356 {

	public static void main(String[] args) {
		
		Course course = Course.JAVA;
		System.out.println(course);
		System.out.println(Course.JDBC);
		System.out.println(Course.SERVLET);
		
		Course courseSPR = new Course();
		courseSPR.setName("Spring");
		courseSPR.setFaculty("Krishna");
		courseSPR.setFee(7600.00);
		courseSPR.setDuration(5);
		courseSPR.setLocation("Nagpur");
		System.out.println(courseSPR);
		System.out.println(Course.SPRING);
		
	}
}

class Course{

	public static Course JAVA = new Course("Java", "Sri-ram", 5600.00, 4, "Pune");
	public static Course JDBC = new Course("Jdbc", "Shayam", 4500.00, 3, "Indore");
	public static Course SERVLET = new Course("Servlet","Govinda", 6740.00, 4, "Bangalure");
	public static Course SPRING = new Course();
	
	private String name;
	private String faculty;
	private double fee;
	private int duration;
	private String location;
	
	Course() {	}
	
	public Course(String name, String faculty, double fee, int duration,
			String location) {
		super();
		this.name = name;
		this.faculty = faculty;
		this.fee = fee;
		this.duration = duration;
		this.location = location;
	}
	
	
	public static Course getJAVA() {
		return JAVA;
	}

	public static void setJAVA(Course jAVA) {
		JAVA = jAVA;
	}

	public static Course getJDBC() {
		return JDBC;
	}

	public static void setJDBC(Course jDBC) {
		JDBC = jDBC;
	}

	public static Course getSERVLET() {
		return SERVLET;
	}

	public static void setSERVLET(Course sERVLET) {
		SERVLET = sERVLET;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		//return name+" :"+faculty+fee+duration+location;
		return "Name - "+name+" ::"+"\nFaculty - "+faculty+"\nFee - "+fee+"\nDuration - "+duration+"\nLocation - "+location+"\n";
	}
	
}