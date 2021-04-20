package day2Javaexercise;

import java.util.Scanner;

public class Q4userinput {

	public static void main(String[] args) {
		// 4.	Write Java program to allow the user to input his/her age. 
		//Then the program will show if the person is eligible to vote. 
		//A person who is eligible to vote must be older than or equal to 18 years old

		//string
				//create scanner object
		        Scanner input = new Scanner(System.in);
		         
		        System.out.print("Enter your age whether or not you are eligible to vote :");
		        //prompt user
		        int age = input.nextInt();
		  if (age>=18) {
			  System.out.print("You are eligible to vote :");
		  } else {
			  System.out.print("You are not eligible to vote :");
		  }
	}

}
