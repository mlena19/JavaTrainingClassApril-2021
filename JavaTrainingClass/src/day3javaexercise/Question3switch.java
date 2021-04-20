package day3javaexercise;

import java.util.Scanner;

public class Question3switch {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter value between 1 to 7:");
		
		int day = input.nextInt();
		switch(day) { 
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednsday");
		break;
		case 4:
			System.out.println("Thursday");
		break;
		case 5:
			System.out.println("Friday");
		break;
		case 6:
			System.out.println("Saturday");
		break;
		case 7:
			System.out.println("Sunday");
		break;	
		}
		if(day <=5) {
			System.out.println("Weekday");
		}else {
			System.out.println("Weekend");
		}
		input.close();
		}
}
