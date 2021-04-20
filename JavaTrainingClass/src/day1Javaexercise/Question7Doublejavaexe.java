package day1Javaexercise;

public class Question7Doublejavaexe {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the area and perimeter of a circle. Test Data
		 * Hint: Use Math.PIRadius = 7.5Expected OutputPerimeter is = 47.12388980384689
		 * Area is = 176.71458676442586
		 */	
		double radius = 7.5;
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		
		System.out.println("Area is = " + area);
		System.out.println("Perimeter is = " + perimeter);
		
	}
	

}
