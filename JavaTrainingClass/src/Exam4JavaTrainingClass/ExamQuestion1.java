package Exam4JavaTrainingClass;

public class ExamQuestion1 {

	public static void main(String[] args) {
		// 1. Write a program that have variables
		
		//Datatype variable 
		String name = "Mlen, Abreha";
		String cityState = "Charlotte, NC";
		//String state = "NC";
		double grossSalary = 50000.00;
		double tax = 0.2 * grossSalary;
		double net_salary = grossSalary - tax;
		

		System.out.println("Hello my name is: "  + name + "," + "\n" + "I live in " + cityState + "," + "\n"  + "my gross salary is "
				+ grossSalary + "\n" + "and I pay" + tax + " in tax and I take home " + net_salary);

	}

}
