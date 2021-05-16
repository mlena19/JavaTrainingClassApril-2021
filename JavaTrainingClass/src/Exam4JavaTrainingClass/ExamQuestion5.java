package Exam4JavaTrainingClass;

public class ExamQuestion5 {

	public static void isValid(String phoneNumber, String phoneNumber1, String phoneNumber3) {
	}

	// Use the above method to apply the below task

	public static void main(String[] args) {

		String phoneNumber = "6414514473";
		String phoneNumber1 = "62354609845454";
		String phoneNumber2 = "56454";

		if (isValid(phoneNumber)) {
			System.out.println("Valid phone Number");
			if (isValid(phoneNumber1)) {
				System.out.println("Invalid phone number (too long)");

				if (isValid(phoneNumber2)) {
					System.out.println("Invalid phone number (too short)");

				} else
					System.out.println("Inacceptable Number");
			}

		}
	}

	private static boolean isValid(String phoneNumber1) {
		// TODO Auto-generated method stub
		return false;
	}
}
