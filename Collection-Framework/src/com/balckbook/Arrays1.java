package com.balckbook;

import java.util.Arrays;
import java.util.Comparator;


class Ascend implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2){
		return i1.compareTo(i2);
	}
}
class Descend implements Comparator<Integer>{
	public int compare(Integer i1,Integer i2){
		return i2.compareTo(i1);
	}
}

public class Arrays1 {

	public static void main(String[] args) {
		
		Integer arr[]={55,87,34,67};
		
		System.out.println("------- Ascend ------------");
		Arrays.sort(arr,new Ascend());
		display(arr);
		System.out.println();
		System.out.println("------- Descend ------------");
		Arrays.sort(arr,new Descend());
		display(arr);
	}
	
	static void display(Integer arr[]){
		for(Integer i:arr){
			System.out.print(i+"\t");
		}
	}

}
