package src.com.jlc.test;

import java.util.Comparator;
import java.util.HashMap;

public class Test127 {

	public static void main(String[] args) {
		
		HashMap<StudentClg, Integer> map = new HashMap<StudentClg, Integer>();
		map.put(new StudentClg(101, "Rahul", 18.5f), 11);
		map.put(new StudentClg(108, "Kaushal", 21.5f), 44);
		map.put(new StudentClg(108, "Rustam", 19.5f), 22);
		map.put(new StudentClg(102, "Sumit", 18.1f), 88);
		map.put(new StudentClg(102, "Ankur", 18.5f), 22);
		map.put(new StudentClg(102, "Ankur", 18.5f), 33);
		
		System.out.println(map);
	}
}

class ascending implements Comparator<EmplyClg>{
	@Override
	public int compare(EmplyClg o1, EmplyClg o2) {
		return o1.compareTo(o2);
	}
}

class StudentClg{
	private int id;
	private String name;
	private float age;
	
	public StudentClg() {
		// TODO Auto-generated constructor stub
	}

	public StudentClg(int id, String name, float age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StudentClg) {
			StudentClg stu = (StudentClg) obj;
			return this.id == stu.id;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return id +" : "+name+" - "+age+"\n";
	}
}

class EmplyClg{
	private int id;
	private String name;
	private float age;
	
	public EmplyClg() {
		// TODO Auto-generated constructor stub
	}

	public EmplyClg(int id, String name, float age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Object emp) {
		EmplyClg ec = (EmplyClg)emp;
		//return this.id-ec.id;
		return this.name.compareTo(ec.name);
	}
	
	@Override
	public String toString() {
		return id +" : "+name+" - "+age;
	}
}

