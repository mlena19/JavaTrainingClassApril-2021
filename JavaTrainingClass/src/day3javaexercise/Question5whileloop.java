package day3javaexercise;

import java.util.Scanner;

public class Question5whileloop {

	public static void main(String[] args) {
		/* 5. Use while loop and create a program that calculates the average of the
		 * numbers between x and y. x and y are the integers the user has to input.
		 * Enter x : 2 Enter y : 6 Enter x : 2 Enter y : 6 The average is : 4*/
		
		
		  Scanner input = new Scanner(System.in); 
		  System.out.print("Enter value x: ");
		  int x=input.nextInt(); 
		  System.out.print("Enter value y: "); 
		  int y=input.nextInt();
		  
		  int sum = 0; 
		  int counter = 0; 
		  
		  while(sum <=0) {
		  { counter= x+y;
		  sum++; } 
		  int average = counter/2;
		  System.out.println("The average between x and y is: " + average);
		 
		  }
				
	}

}
