package src.edu.study;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test_MapComparator {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>(new ComprClass());
		map.put("MP", "Bhopal");
		map.put("Rajesthan", "Jaiur");
		map.put("MP", "Bhopal");
		map.put("Gujarat", "Ahmedabad");
		System.out.println(map);
		
		
	}

}


class ComprClass implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		System.out.println("-----compare----");
		return o2.compareTo(o1);
	}
}