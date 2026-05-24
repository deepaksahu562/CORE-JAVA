package src.edu.guide;

public class Test101 {
	

	public static void main(String[] args) {

		// Unsorted Array
		//int array[] = { 1, 2, 3, 4, 56, 6, 66, 6, 7 }; // present
		int array[] = { 1, 2, 3, 4, 6, 66, 6, 7, 56 }; // not present
		int subArray[] = { 3, 4, 56 };

		System.out.println("SubArray Present:" + isSubArrayPresent(array, subArray));
	}

	public static boolean isSubArrayPresent(int array[], int subArray[]) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			int value1 = array[i]; 
			if(count == subArray.length){break;}
			for (int j = 0; j < subArray.length; j++) {
				int value2 = subArray[j];
				if(value1 == value2){
					flag = true;
					count ++;
				}else {
					flag = false;
				}
			}
		}
		return flag;
	}
}
