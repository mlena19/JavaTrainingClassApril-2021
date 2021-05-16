package Exam4JavaTrainingClass;

public class Person {

	//Create an application that has the following three classes. 
	//Student and Instructor that inherit from the Person class.
		protected String firstName;
		private String lastName;
		private String phoneNumber;

		//constructor
		public Person() {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
		}
		//getters and setters
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		//toString method		
		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
		}
		
	}


