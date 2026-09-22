package org.ritesh;
import java.util.TreeSet;

public class Ceiling {

	public static void main(String[] args) {
		
	// 15. get the element in a tree set which is greater than or equal to the given element.
	// (Hint : Use the ceiling method of the TreeSet)
		TreeSet<Integer> list = new TreeSet<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		System.out.println("Ceiling of 13 is: " + list.ceiling(13));
		System.out.println("Ceiling of 21 is: " + list.ceiling(21));
	}
}
