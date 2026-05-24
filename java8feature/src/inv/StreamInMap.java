package src.inv;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamInMap {
	

	public static void main(String[] args) {
		System.out.println("Hello World......!!");
		
		Map<Integer , Patient> pmap = new HashMap<>();
		pmap.put(1, new Patient(101, "A"));
		pmap.put(2, new Patient(104, "AB"));
		pmap.put(3, new Patient(102, "B"));
		pmap.put(4, new Patient(103, "A"));
		
		
		Set<Entry<Integer, Patient>> set  = pmap.entrySet();
		
		List<Patient> list = set.stream()
				.map(entry -> entry.getValue())
				.filter(data -> data.getbGroup().equalsIgnoreCase("A"))
				.collect(Collectors.toList());
		
		System.out.println(list);
	}

}


class Patient{
	int pId;
	String bGroup;
	
	public Patient(int pId, String bGroup) {
		this.pId = pId;
		this.bGroup = bGroup;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getbGroup() {
		return bGroup;
	}
	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", bGroup=" + bGroup + "]";
	}
	
	
}