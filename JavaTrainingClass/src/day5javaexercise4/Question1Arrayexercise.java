package day5javaexercise4;

public class Question1Arrayexercise {

	public static void main(String[] args) {
		// TWrite a Java program to calculate the average value of array integers.
		int[] myArray = {12, 14, 16, 18, 20, 22};
		int dimir = 0;

        for(int i=0; i<myArray.length; i++){
        	dimir = dimir +myArray[i];
        }

        /* myArray.length returns the number of elements 
         * present in the array
         */
        int average = dimir / myArray.length;
        System.out.println("The average is:" + average);
				
	}

}
