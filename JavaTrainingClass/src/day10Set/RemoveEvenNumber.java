package day10Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumber {

	public static void main(String[] args) {
		// Q3 a remove myList using for loop
		// b. remove myListIterator using Iterator

		List<Integer> myList = new ArrayList<>();

		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(5);

		for (int i = 0; i < myList.size(); i++) {
			int j = myList.get(i);

			if (j % 2 == 0) {
				myList.remove(i);

				i--;

			}
		}

		System.out.println(myList);

		
		  // b. remove myListIterator using Iterator Integer iter = myList.iterator();
		  
		Iterator<Integer> iter = myList.iterator(); 
		while (iter.hasNext()) { 
			if((Integer) iter.next()%2 ==0) {
				iter.remove();
			}
					
		}
		  
		System.out.println(myList);
		 
	}
}
