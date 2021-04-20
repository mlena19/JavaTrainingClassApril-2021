package day2Javaexercise;

import java.util.Scanner;

public class Q3userinputexercise {

	public static void main(String[] args) {
		// 3.	Write a Java program to get a number from the user and print 
		//whether it is positive or negative

		//string
		//create scanner object
        Scanner input = new Scanner(System.in);
         int num = 3;
        System.out.print("Enter a number whether it is positive or negative :");
        //prompt user
        int num1 = input.nextInt();
        if (num1>=4) {
        	System.out.println("The number you enter is Positive: " + num);
        }
        
        else {
        	System.out.println("The number you enter is Negative: " + num);
        }
        	
        input.close();
	}

}
