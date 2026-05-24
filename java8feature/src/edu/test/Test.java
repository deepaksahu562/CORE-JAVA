package src.edu.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		String s1 ="a2b3c4d5";
		//output = a##b###c####d######

		char[] charArray = s1.toCharArray();


		Stream.of(s1).map(s -> s);


	}

}
