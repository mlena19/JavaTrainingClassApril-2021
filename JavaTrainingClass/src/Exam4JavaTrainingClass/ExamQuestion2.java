package Exam4JavaTrainingClass;

import java.util.Scanner;

public class ExamQuestion2 {
//Write a program that accepts mark of a student and prints the grade
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the mark of a student and prints the grade");
		int average = input.nextInt();
		char grade;
		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 80) {
			System.out.println("B");
		} else if (average >= 70) {
			System.out.println("C");
		} else if (average >= 50) {
			System.out.println("D");
		} else {
			System.out.println("F");
			input.close();
		}
	}
}
