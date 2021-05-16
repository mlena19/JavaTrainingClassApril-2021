package Exam4JavaTrainingClass;

public class Student extends Person{

	private int gpa;
	
	//Constructor
	public Student(String firstName, String lastName, String phoneNumber, int gpa) {
		super();
		this.gpa = gpa;
	}

		public Student(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	//getters and setters
	public int getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	//toString method	

	@Override
	public String toString() {
		return "Student [gpa=" + gpa + "]";
	}
	
	}
