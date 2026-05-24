package edu.java8;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurance {

	public static void main(String[] args) {

		Stream.of("11","22", "11", "22", "44", "55", "55", "11")
		.collect(Collectors.toMap(Function.identity(), valueMapper -> 1, Integer::sum)).forEach((key,value)->System.out.println(key+":"+value));
		
	}

}
