package src.com.java15;

public class Lab1018 {

	public static void main(String[] args) {
		Stud st = new Stud("SRI");
		Emp em = new Emp("SRI");
		System.out.println(st.snm == em.enm);
		System.out.println(st.snm.hashCode()+"......"+em.enm.hashCode());
		st.show(em);
	}
}

class Stud{
	String snm;
	Stud(String snm){
		this.snm = snm;
	}
	void show(Emp em){
		String msg = "SRI";
		System.out.println(em.enm == msg);
		System.out.println(em.enm == snm);
		em.display(this);
	}
}

class Emp{
	String enm;
	Emp(String enm){
		this.enm = enm;
	}
	void display(Stud st){
		String var = "SRI";
		System.out.println(st.snm == var);
		System.out.println(st.snm == enm);
	}
}