package day10Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setinterface {

	public static void main(String[] args) {
		// Given the list below, please find the sorted unique values, using the set interface(‘A’,’F’,’A’,’D’, ‘F’,’C’, ‘B’)

		// Get the HashSet
        Set<String> mySortedset = new HashSet<>();
        mySortedset.add("‘A");
        mySortedset.add("‘F");
        mySortedset.add("‘A");
        mySortedset.add("‘D");
        mySortedset.add("‘F");
        mySortedset.add("‘C");
        mySortedset.add("‘B");
  
        System.out.println("The Given Values converted to Hashset: "
                           + mySortedset);
     // Convert the HashSet to TreeSet
        Set<String> hashSetToTreeSet = new TreeSet<>(mySortedset);
  
        // Print the TreeSet
        System.out.println("My sorted unique values are: "
                           + hashSetToTreeSet);
	}

}
