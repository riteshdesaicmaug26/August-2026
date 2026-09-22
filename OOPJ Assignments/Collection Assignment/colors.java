package org.ritesh;
import java.util.ArrayList;  //to create arraylist
import java.util.Iterator;
import java.util.Collections;

public class colors {

	public static void main(String[] args) {
		
		// 1. add some colors (string) and print out the collection.
		ArrayList<String> list = new ArrayList<>();
	    list.add("Red");
	    list.add("Blue");
	    list.add("Green");
	    list.add("White");
	    
	    // 2. insert an element into the array list at the first position.

	    list.add(0, "Black");
	    
	    
        // 4. update specific array element by given element.
	    String newElement = "Orange"; 
	    list.set(4, newElement);
	    
	    // 5. remove the third element from a array list.
	    list.remove(3);
	    
	    //checks if there is another element availaible and print it until while is false
	    Iterator<String> itr = list.iterator();
	    while(itr.hasNext()) {
	    	   System.out.print(itr.next() + " ");
	    }
	    
	    // 3. retrieve an element (at a specified index)
	    int index = 2;  //storing index of an element
	    System.out.println("\nElement at index " + index + " is: " + list.get(index));
	    
	    // 6. search an element in a array list.
	    if (list.contains("Red")) {
	    	System.out.println("Color Is Present");
	    }
	    else 
	    {
	    	System.out.println("Color Is Not Present");
	    }
	    
	    // 7. sort a given array list.
	    Collections.sort(list);
	    System.out.println("After Sorting: " + list);

	    // 8. Copy one array list into another.
	    ArrayList<String> list2 = new ArrayList<>();
	    // Give list2 the same size as list
	    for (int iTemp = 0; iTemp < list.size(); iTemp++) 
	    {
	        list2.add(null);
	    }

	    Collections.copy(list2, list);
	    System.out.println("Copied Array:" + list2);
	    
	    // 9.  shuffle elements in a array list.
	    Collections.shuffle(list2);
	    System.out.println("Shuffled List: " + list2);
	    
	    // 10. reverse elements in a array list.
	    Collections.reverse(list2);
	    System.out.println("Reversed List: " + list2);
	    
	}

}
