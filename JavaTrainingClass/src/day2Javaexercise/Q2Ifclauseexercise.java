package day2Javaexercise;

import java.util.Scanner;

public class Q2Ifclauseexercise {

	public static void main(String[] args) {
		// 2.	Write a Java program to check if an input string starts with “T”. If it is start with “T” 
		//print “Yes that is the string”, otherwise print “That is not the one”.
		
		//create object
        Scanner input = new Scanner(System.in);
         String letter = "T";
                 //prompt user
        System.out.print("Enter a letter:");
        String letter2 = input.nextLine();
        System.out.println("You entered: " + letter2);
        if ( letter2.startsWith(letter)) {
        	System.out.println("Yes that's a string: " + letter);
        }
        
        else if (letter2 == "") {
        	
          System.out.println("That's empty: " + letter);
        }
        
	else {
		System.out.println("That's invalid: ");
        	
        input.close();
	}

}
	
}
