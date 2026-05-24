package com.test;

public class SecondLargestNum {

	public static void main(String[] args) {
		int largeNum = 0;
		int secondLarge = 0;
		int arr[] = {8,4,3,6,1,23,56};
		//arr = {8,4,3,6,1,23,56};
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>largeNum) {
				secondLarge = largeNum;
				largeNum = arr[i];
			} else if(arr[i]>secondLarge){
				secondLarge = arr[i];
			}
		}
		System.out.println("LargeNum is 		:"+largeNum);
		System.out.println("SecondLargeNum is 	:"+secondLarge);
		
	}

}
