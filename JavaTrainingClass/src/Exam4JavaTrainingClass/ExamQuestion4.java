package Exam4JavaTrainingClass;

public class ExamQuestion4 {
	public static void main(String[] args) {
		// Q4 Write a program that takes a string and
		// displays the vowels count in the input string
		// Step 1, initialize the inputs
		int vowelCount = 0, constantCount = 0;
		// declare a string
		String str = "africa";
		//String str1 = "sky";

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				vowelCount++;
			}
		}
		System.out.print("The vowels count in the input string str is: " + vowelCount);
	}
}
