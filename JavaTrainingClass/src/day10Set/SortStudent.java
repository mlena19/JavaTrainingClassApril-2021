package day10Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent implements Comparable<SortStudent>{

		//Given Student class sort students list with their first name using comparable interface
		
		private String firstName;
		private int age;
		
		//constructor here
		public SortStudent(String firstName, int age) {
			super();
			this.firstName = firstName;
			this.age = age;
		//getter and setters here
	
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		//add toString methode here
		@Override
		public String toString() {
			return "SortStudent [firstName=" + firstName + ", age=" + age + "]";
		}
			//Collections.sort
		public static void main(String[] args) {
			SortStudent M= new SortStudent("Hagos",20);
			SortStudent N= new SortStudent("Zeray",18);
			SortStudent Z= new SortStudent("Tirhas",25);
			SortStudent A = new SortStudent("Seble",23);
			List<SortStudent> students = new ArrayList<>();
			students.add(M);
			students.add(N);
			students.add(Z);
			students.add(A);
			
			System.out.println(students);
			Collections.sort((students));
			System.out.println(students);
		}

		@Override
		public int compareTo(SortStudent o) {
			// TODO Auto-generated method stub
			return 0;
		}
}
