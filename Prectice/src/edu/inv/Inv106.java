package src.edu.inv;

//Given an Array and a Number N, find the pairs in an array which sum would be N. No Duplicates.

/*[12:50 PM] Naresh Kumar
array - [1,2,3,4,5,6,7,8,9,10]
N - 10
​[12:51 PM] Naresh Kumar
(1,9) (2,8) (3,7) (4,6)
*/


public class Inv106 {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		display(array, 10);
	}
	
	static void display(int [] array, int num){
		
		for (int i : array) {
			int firstNo = 0;
			int secNo = 0;
			int counter = 1;
			for (int j : array) {
				if(counter > array.length / 2 ){
					if(i+j == num){
						firstNo = i;
						secNo = j;
					}
				}
				
				counter++;
			}
			if(firstNo != secNo)		System.out.print(", ("+firstNo+","+secNo+")");
			
		}
		
	}
}
