package day10Set;

import java.util.HashSet;
import java.util.Set;

public class SettwoInterface {

	public static void main(String[] args) {
		
		/*
		 *Given Two sets below two setsSet1: [3,4,5,7,8,9]Set2 [5,2,4,6,7,11]
		 *a.Find the intersection in those sets
		 *b.Find the union in those sets 
		 *c.Find the only unique elements in set2
		 */
		//// create first set
	Set<Integer> set1 = new HashSet<>();
	set1.add(3);
	set1.add(4);
	set1.add(5);
	set1.add(7);
	set1.add(8);
	set1.add(9);
	System.out.println("Value on set1 are: " + set1);
	
	//// create second set
	Set<Integer> set2 = new HashSet<>();
	
	set2.add(5);
	set2.add(2);
	set2.add(4);
	set2.add(6);
	set2.add(7);
	set2.add(11);
	System.out.println("Value on set2 are: " + set2);
	  // Find the intersection of the above two sets 
	set2.retainAll(set1);
    System.out.println("Intersection: " + set2);
    // Find the union of the above two sets
    set2.addAll(set1);
    System.out.println("Union is: " + set2);
	}

}
