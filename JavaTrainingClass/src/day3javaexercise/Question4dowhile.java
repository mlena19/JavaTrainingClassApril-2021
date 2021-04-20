package day3javaexercise;

import java.util.Scanner;

public class Question4dowhile {

	public static void main(String[] args) {
		/*
		 * 4. Write a program that takes a positive integer input and prints all the
		 * positive even number less than the number in order from big to small.(Use do
		 * while loop)
		 Enter number: 7 4 2

		 */
Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of X:");
		int n=input.nextInt();
		
		int counter=n;
		
		do 
		{
			n--;
			if(n % 2 == 0){
			System.out.println(n);
			}
			
	}
			while(n > 0);
			
		input.close();	
		
		
}
  
}



