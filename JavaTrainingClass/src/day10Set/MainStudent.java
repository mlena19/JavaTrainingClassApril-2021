package day10Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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

}
