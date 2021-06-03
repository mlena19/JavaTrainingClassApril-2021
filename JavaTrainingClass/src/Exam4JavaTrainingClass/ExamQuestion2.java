package Exam4JavaTrainingClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamQuestion2 {
//Write a program that accepts mark of a student and prints the grade
	public static void main(String[] args) {
		try {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the mark of a student and prints the grade: ");
		
		//prompt user
		int average = input.nextInt();

		if (average >= 90) {
			System.out.println("Grade: A");
		} 
		else if (average >= 80) {
			System.out.println("Grade: B");
		} 
		else if (average >= 70) {
			System.out.println("Grade: C");
		} 
		else if (average >= 50) {
			System.out.println("Grade: D");
		} 
		else {
			System.out.println("Grade: F");
			input.close();
		}
		}catch(InputMismatchException e) {
			System.out.println("You entered invalid value");
		}
	}
}
