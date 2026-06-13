package src.edu._2026.practice;

public class SecondLargestNumber {

    public static void main(String[] args) {
        //int arr[] = {5,8,6,9, 65, 100,99, 2, 405, 55, 405, -5};
        int arr[] = {-5,-8,-6,-9, -65, -100,-99, -5};
        int largest = -999999999;
        int secondLargest = 0;
        for (int i : arr){
            if (i>largest){
                secondLargest = largest;
                largest = i;

            }else if (i>secondLargest && i<largest){
                secondLargest = i;
            }
        }
        System.out.println("Largest :"+largest);
        System.out.println("Second Largest :"+secondLargest);
    }
}
