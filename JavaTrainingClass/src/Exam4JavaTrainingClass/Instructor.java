package Exam4JavaTrainingClass;

public class Instructor extends Person{
	
	private static int grossSalary;
	//constructor
	public Instructor(String firstName, String lastName, String phoneNumber, int grossSalary) {
		super();
		this.grossSalary = grossSalary;
	}
	//getters and setters
	
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	//toString method
	@Override
	public String toString() {
		return "Instructor [grossSalary=" + grossSalary + "]";
	
	}
	public boolean calculateNetSalary(int grossSalary) {
		
		double taxRate = 0.20;
	    double tax = 150 * taxRate;
	    double netSalary = 150 - tax;
	    return netSalary;
	
	
	  public static void main(String[] args) {
	    Instructor ins = new Instructor("Aman", "150", getFirstName(), grossSalary);
	    Student stu = new Student("Ashu", "100");
	    
	   System.out.print(ins.calculateNetSalary(grossSalary));
	
}
	}
