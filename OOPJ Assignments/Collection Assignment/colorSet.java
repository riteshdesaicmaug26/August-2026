package org.ritesh;
import java.util.TreeSet;

public class colorSet {

	public static void main(String[] args) {
		
    // 11. create a new tree set, add some colors (string) and print out the tree set. 
	TreeSet<String> colors = new TreeSet<>();
		
	colors.add("Red");
	colors.add("Blue");
	colors.add("Green");
	colors.add("Yellow");
	colors.add("Black");
	
	System.out.println("TreeSet: " + colors);
	
	// 12. Add all the elements of a specified tree set to another tree set.  
	TreeSet<String> colors2 = new TreeSet<>();
	colors2.add("Orange");
	colors2.add("Brown");

	System.out.println("Second TreeSet before adding: " + colors2);
	
	colors2.addAll(colors);
	
	System.out.println("Second TreeSet after adding: " + colors2);
		
	// 13. Create a reverse order view of the elements contained in a given tree set.
    System.out.println("Reverse: " + colors2.descendingSet());
	
    // 14. Get the first and last elements in a tree set.
    System.out.println("First Element: " + colors2.first());
    System.out.println("Last Element: " + colors2.last());

	}
}
