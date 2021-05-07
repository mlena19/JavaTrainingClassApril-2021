package day5javaexercise4;

public class Question3Arrayexercise {

	public static void main(String[] args) {
		// Write a Java program to find the index of an array element. 
		//[4, 6, 7, 9] x=7

				int myArray[] = {4, 6, 7, 9};
		 
        for (int i = 0; myArray.length > i; i++) {
 
            System.out.println(i + " Index number Element is " + myArray[i]);
        }
    }
}

