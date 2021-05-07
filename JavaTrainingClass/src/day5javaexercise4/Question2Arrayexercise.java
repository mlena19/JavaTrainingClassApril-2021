package day5javaexercise4;

public class Question2Arrayexercise {

	public static void main(String[] args) {
		// Write a Java program to test if an array contains a specific value. 
		//[4, 6, 7, 9] x=5

				int[] myArray = {4, 6, 7, 9};
	      int x = 5;

	      for(int i = 0; i<myArray.length; i++){
	         if(x == myArray[i]){
	            System.out.println("Array contains the given element");
	         }
	      }
	   }
	}