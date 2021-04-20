package day2Javaexercise;

import java.util.Scanner;

public class Q5Scanner {

	public static void main(String[] args) {
		/*
		 * // 5. Write a Java program which reads two integers from the user and prints
		 * the sum and difference both in their own line. Example Enter first number: 7
		 * Enter second number: 6 5. Write a Java program which reads two integers from
		 * the user and prints the sum and difference both in their own line. Example
		 * Enter first number: 7 Enter second number: 6
		 */


         Scanner input = new Scanner(System.in);
         System.out.print("Enter first number :");
	        //prompt user
         int num1 = input.nextInt();
         System.out.print("Enter second number :");
         int num2 = input.nextInt();
         int sum = num1 + num2;
         int sub = num1 - num2;
         System.out.println("Sum of the num1 and num2 = " + sum);
         System.out.println("Difference of the num1 and num2 = " + sub);
         
         input.close();
	}

}
